package com.ing.zoo.animals;

import com.ing.zoo.interfaces.CanEatLeaves;
import com.ing.zoo.interfaces.CanEatMeat;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Pig extends Animal implements CanEatLeaves, CanEatMeat, TrickPerformer {

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("oink oink");
    }

    @Override
    public void eatLeaves() {
        System.out.println(name + " is eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println(name + " is eating meat");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);

        if (rnd == 0) {
            System.out.println(name + " rolls in the mud");
        } else {
            System.out.println(name + " runs in circles");
        }
    }
}
