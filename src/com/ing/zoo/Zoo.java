package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Henk"));
        animals.add(new Hippo("Hlsa"));
        animals.add(new Pig("Dora"));
        animals.add(new Tiger("Wally"));
        animals.add(new Zebra("Marty"));
        animals.add(new Bear("Winnie"));
        animals.add(new Cow("Paula"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim().replaceAll("\\s+", " ");

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
    }
}
