public abstract class Fish extends Animals{

    /** Class variables */
    private boolean canBreathUnderwater;
    private boolean hasFins;

    /** Default Constructor */
    public Fish (){}

    /** Constructor with all variables */
    public Fish(String name, int age, int weight, char sex, String hasFins) {
        super(name, age, weight, sex, hasFins);
    }

    public boolean isCanBreathUnderwater() {
        return canBreathUnderwater;
    }

    public void setCanBreathUnderwater(boolean canBreathUnderwater) {
        this.canBreathUnderwater = canBreathUnderwater;
    }

    public boolean isHasFins() {
        return hasFins;
    }

    public void setHasFins(boolean hasFins) {
        this.hasFins = hasFins;
    }

    @Override
    public void addAnimals(Animals animal) {
    }

    @Override
    public void printAllZooAnimals() {
    }
}

