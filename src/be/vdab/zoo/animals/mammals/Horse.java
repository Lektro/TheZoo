package be.vdab.zoo.animals.mammals;

import be.vdab.zoo.animals.Animals;

public abstract class Horse extends Animals {

    /** Default Constructor */
    public Horse (){}

    /** Constructor with all variables */
    public Horse(String name, int age, int weight, char sex, String color) {
        super(name, age, weight, sex, color);
    }
}
