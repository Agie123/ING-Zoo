package com.ing.zoo.animals;

import com.ing.zoo.models.Animal;

import java.util.Random;

public class Pig extends Animal {
    public String helloText;
    public String eatText;
    public String trick;

    public Pig(String name, String species) {
        super(name, species);
    }

    @Override
    public String sayHello()
    {
        helloText = "oink oink";
        return helloText;
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
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
