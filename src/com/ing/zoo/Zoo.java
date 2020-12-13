package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.models.Animal;

import java.util.Scanner;

public class Zoo {
    //static variables
    static Animal[] animals;
    static String[] commands;
    static String input;
    static Scanner scanner;

    public static void main(String[] args) {
        //initializing and populizing the animals array
        animals = new Animal[7];
        animals[0] = new Lion("henk", "lion");
        animals[1] = new Hippo("elsa", "hippo");
        animals[2] = new Pig("dora", "pig");
        animals[3] = new Tiger("wally", "tiger");
        animals[4] = new Zebra("marty", "zebra");
        animals[5] = new Monkey("zook", "monkey");
        animals[6] = new Fish("starmie", "fish");

        //a foreach loop to loop through the array of animals that are in the zoo
        System.out.println("The animals in the zoo are: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " the " + animal.getSpecies());
        }

        //initializing and populizing the commands array
        commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //a foreach loop to loop through the array of commands that are available for use
        System.out.println("\nThe current commands are: ");
        for (String command : commands) {
            System.out.println(command);
        }

        scanner = new Scanner(System.in);
        System.out.print("\nEnter your command: ");

        input = scanner.nextLine();
        checkCommand();
    }

    public static void checkCommand() {

        //a foreach loop to loop through all the animals
        for (Animal value : animals) {
            //checks whether the input equals hello + the name of the animal
            if (input.equals(commands[0] + " " + value.getName())) {
                System.out.println(value.getName() +
                        " the " +
                        value.getSpecies() +
                        ": " +
                        value.sayHello());
                return;
            }
        }

        //checks whether the input equals hello
        if (input.equals(commands[0])) {
            //makes all the animals say hello with a foreach loop
            for (Animal animal : animals) {
                System.out.print(animal.getName() +
                        " the " +
                        animal.getSpecies() +
                        ": " +
                        animal.sayHello() +
                        "\n");
            }
        } else if (input.equals(commands[1])) {
            //if input equals give leaves
            //let all the animals that are herbivores eat leaves with a foreach loop
            for (Animal animal : animals) {
                if (animal.isHerbivore()) {
                    System.out.print(animal.getName()
                            + " the "
                            + animal.getSpecies()
                            + ": ");
                    animal.eatLeaves();
                }
            }
        } else if (input.equals(commands[2])) {
            //if input equals give meat
            //let all the animals that are carnivores eat meat with a foreach loop
            for (Animal animal : animals) {
                if (animal.isCarnivore()) {
                    System.out.print(animal.getName() +
                            " the " +
                            animal.getSpecies() +
                            ": ");
                    animal.eatMeat();
                }
            }
        } else if (input.equals(commands[3])) {
            //if input equals perform trick
            //let all the animals that can perform a trick, perform a trick
            for (Animal animal : animals) {
                if (animal.isCanPerformTrick()) {
                    System.out.print(animal.getName() +
                            " the " +
                            animal.getSpecies()
                            + ": ");
                    animal.performTrick();
                }
            }
        } else {
            //gives a message when the user uses an unknown command and let's them try again.
            System.out.println("Unknown command: " + input + "\n\nTry again, enter your command: ");

            input = scanner.nextLine();
            checkCommand();
        }
    }
}