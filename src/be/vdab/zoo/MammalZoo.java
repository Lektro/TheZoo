package be.vdab.zoo;

import be.vdab.zoo.animals.mammals.Cat;
import be.vdab.zoo.animals.mammals.Horse;

public abstract class MammalZoo extends Zoo {

    /** Class Arrays */
    private Cat[] cats;
    private Horse[] horses;

    public MammalZoo(){
        cats = new Cat[0];
        horses = new Horse[0];

    }
}
