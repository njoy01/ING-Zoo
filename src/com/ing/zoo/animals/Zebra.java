package com.ing.zoo.animals;

import com.ing.zoo.interfaces.CanEatLeaves;

public class Zebra extends Animal implements CanEatLeaves {

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("zebra zebra");
    }

    @Override
    public void eatLeaves() {
        System.out.println(name + " is eating grass");
    }
}

