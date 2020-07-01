package be.vdab.zoo;

import be.vdab.app.ZooAppV1;
import be.vdab.zoo.animals.Animals;

public abstract class Zoo extends ZooAppV1 {

    /** add animals to zoo */
    public abstract void addAnimals (Animals animal);

    /** print animals that are in the current zoo */
    public abstract void printAllZooAnimals();


    // insert 5 Arrays here

}