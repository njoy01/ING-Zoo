package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.interfaces.CanEatLeaves;
import com.ing.zoo.interfaces.CanEatMeat;
import com.ing.zoo.interfaces.TrickPerformer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        animals.add(new Bear("winnie"));
        animals.add(new Cow("paula"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim().replaceAll("\\s+", " ");

        // Hello command
        if (input.equals("hello")) {
            for (Animal animal : animals) {
                animal.sayHello();
            }
        } else if (input.startsWith("hello ")) {
            String name = input.substring(6);
            boolean found = false;

            for (Animal animal : animals) {
                if (animal.getName().equalsIgnoreCase(name)) {
                    animal.sayHello();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No animal with the name " + name + " found.");
            }
        }

        // Give meat command
        else if (input.equals("give meat")) {
            for (Animal animal : animals) {
                if (animal instanceof CanEatMeat) {
                    ((CanEatMeat) animal).eatMeat();
                }
            }
        }

        // Give leaves command
        else if (input.equals("give leaves")) {
            for (Animal animal : animals) {
                if (animal instanceof CanEatLeaves) {
                    ((CanEatLeaves) animal).eatLeaves();
                }
            }
        }

        // Perform tricks command
        else if (input.equals("perform trick")) {
            for (Animal animal : animals) {
                if (animal instanceof TrickPerformer) {
                    ((TrickPerformer) animal).performTrick();
                }
            }

            // Specific error handling
        } else {
            String[] parts = input.split(" ");

            if (parts.length > 2) {
                String command = parts[0] + " " + parts[1];

                if (command.equals("give meat")
                        || command.equals("give leaves")
                        || command.equals("perform trick")) {

                    System.out.println(
                            "The command " + command + " can't be applied to a specific animal."
                    );
                    return;
                }
            }
            // Unknown command
            System.out.println("Unknown command: " + input);
        }
    }
}
