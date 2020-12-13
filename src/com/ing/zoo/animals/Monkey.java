package com.ing.zoo.animals;

import com.ing.zoo.models.Animal;

import java.util.Random;

public class Monkey extends Animal {
    public String helloText;
    public String eatText;
    public String trick;

    public Monkey(String name, String species) {
        super(name, species);
    }

    @Override
    public String sayHello() {
        helloText = "oe oe a a";
        return helloText;
    }

    @Override
    public void eatLeaves() {
        eatText = "oe a a delicious";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "oe a a MMMM";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps wildly";
        }
        else
        {
            trick = "throws banana";
        }
        System.out.println(trick);
    }

    public boolean isCarnivore() {
        return true;
    }

    public boolean isHerbivore() {
        return true;
    }

    public boolean isCanPerformTrick() {
        return true;
    }
}
