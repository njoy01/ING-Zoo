package com.ing.zoo.animals;

import com.ing.zoo.interfaces.CanEatLeaves;

public class Hippo extends Animal implements CanEatLeaves {

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    public void eatLeaves() {
        System.out.println(name + " is eating leaves");
    }
}
