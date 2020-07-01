package be.vdab.zoo.animals.mammals;

import be.vdab.zoo.animals.Animals;

public abstract class Cat extends Animals {
    /** Default Constructor */
    public Cat (){}

    /** Constructor with all variables */
    public Cat(String name, int age, int weight, char sex, String color) {
        super(name, age, weight, sex, color);
    }
}
