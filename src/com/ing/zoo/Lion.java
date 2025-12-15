package com.ing.zoo;

public class Lion extends Animal implements CanEatMeat {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    public void eatMeat() {
        System.out.println(name + " is eating meat");
    }
}
