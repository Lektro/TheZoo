package be.vdab.zoo.animals.fish;

import be.vdab.zoo.animals.Animals;

public abstract class Fish extends Animals {


    /** Default Constructor */
    public Fish (){}

    /** Constructor with all variables */
    public Fish(String name, int age, int weight, char sex, String color) {
        super(name, age, weight, sex, color);

    }
}