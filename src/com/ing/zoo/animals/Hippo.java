package com.ing.zoo.animals;

import com.ing.zoo.models.Animal;

public class Hippo extends Animal {
    public String helloText;
    public String eatText;

    public Hippo(String name, String species) {
        super(name, species);
    }

    @Override
    public String sayHello()
    {
        helloText = "splash";
        return helloText;
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        System.out.println("I'm not a carnivore");
    }

    @Override
    public void performTrick() {
        System.out.println("I can't perform a trick");
    }

    public boolean isCarnivore() {
        return false;
    }

    public boolean isHerbivore() {
        return true;
    }

    public boolean isCanPerformTrick() {
        return false;
    }
}
