package com.ing.zoo.animals;

import com.ing.zoo.models.Animal;

public class Fish extends Animal {
    public String helloText;
    public String eatText;

    public Fish(String name, String species) {
        super(name, species);
    }

    @Override
    public String sayHello() {
        helloText = "blub blub";
        return helloText;
    }

    @Override
    public void eatLeaves() {
        System.out.println("I'm not a herbivore");
    }

    @Override
    public void eatMeat() {
        eatText = "blub blub blub mmmm";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        System.out.println("I can't perform a trick");
    }

    public boolean isCarnivore() {
        return true;
    }

    public boolean isHerbivore() {
        return false;
    }

    public boolean isCanPerformTrick() {
        return false;
    }
}
