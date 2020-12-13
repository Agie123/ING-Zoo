package com.ing.zoo.animals;

import com.ing.zoo.models.Animal;

import java.util.Random;

public class Tiger extends Animal {
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name, String species) {
        super(name, species);
    }

    @Override
    public String sayHello()
    {
        helloText = "rraaarww";
        return helloText;
    }

    @Override
    public void eatLeaves() {
        System.out.println("I'm not a herbivore");
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }

    public boolean isCarnivore() {
        return true;
    }

    public boolean isHerbivore() {
        return false;
    }

    public boolean isCanPerformTrick() {
        return true;
    }
}
