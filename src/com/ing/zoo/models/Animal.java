package com.ing.zoo.models;

public abstract class Animal {
    private final String name;
    private final String species;
    private boolean isCarnivore;
    private boolean isHerbivore;
    private boolean canPerformTrick;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String sayHello();

    public abstract void eatLeaves();

    public abstract void eatMeat();

    public abstract void performTrick();

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public boolean isCanPerformTrick() {
        return canPerformTrick;
    }
}
