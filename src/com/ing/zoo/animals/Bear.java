package com.ing.zoo.animals;

import com.ing.zoo.interfaces.CanEatMeat;
import com.ing.zoo.interfaces.TrickPerformer;

public class Bear extends Animal implements CanEatMeat, TrickPerformer {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("growl");
    }

    @Override
    public void eatMeat() {
        System.out.println(name + " is eating meat");
    }

    @Override
    public void performTrick() {
        System.out.println(name + " stands on two legs");
    }
}
