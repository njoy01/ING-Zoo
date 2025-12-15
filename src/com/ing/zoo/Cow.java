package com.ing.zoo;

public class Cow extends Animal implements CanEatLeaves {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("moo");
    }

    public void eatLeaves() {
        System.out.println(name + " is eating leaves");
    }
}
