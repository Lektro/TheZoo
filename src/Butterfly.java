public abstract class Butterfly extends Animals {

    /** Class variables */
    private boolean canFly;

    /** Default Constructor */
    public Butterfly (){}

    public void chirp(){
        System.out.println("The bird is chirping!");
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

