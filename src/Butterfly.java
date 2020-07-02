public abstract class Butterfly extends Animals {

    /** Class variables */
    private boolean canFly;

    /** Default Constructor */
    public Butterfly (){}

    /** Constructor with all variables */
    public Butterfly(String name, int age, int weight, char sex, String color) {
        super(name, age, weight, sex, color);
    }

    public void chirp(){
        System.out.println("The butterfly is flappin around");
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

