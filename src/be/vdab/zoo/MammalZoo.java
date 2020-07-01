package be.vdab.zoo;

public abstract class MammalZoo extends Zoo {

    /** Class Arrays */
    private Cat[] cats;
    private Horse[] horses;

    public MammalZoo(){
        cats = new Cat[0];
        horses = new Horse[0];

    }
}
