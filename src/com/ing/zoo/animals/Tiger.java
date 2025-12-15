package com.ing.zoo.animals;

import com.ing.zoo.interfaces.CanEatMeat;
import com.ing.zoo.interfaces.TrickPerformer;

import java.util.Random;

public class Tiger extends Animal implements CanEatMeat, TrickPerformer {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("rraaarww");
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
            System.out.println(name + " jumps in tree");
        } else {
            System.out.println(name + " scratches ears");
        }
    }

}
