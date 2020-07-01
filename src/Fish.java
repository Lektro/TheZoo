public abstract class Fish extends Animals{

    private boolean canBreathUnderwater;
    private String color;

    public boolean isCanBreathUnderwater() {
        return canBreathUnderwater;
    }

    public void setCanBreathUnderwater(boolean canBreathUnderwater) {
        this.canBreathUnderwater = canBreathUnderwater;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /** Default Constructor */
    public Fish (){}

    /** Constructor with all variables */
    public Fish(String name, int age, int weight, char sex, String color) {
        super(name, age, weight, sex, color);

    }

    @Override
    public void addAnimals(Animals animal) {

    }

    @Override
    public void printAllZooAnimals() {

    }
}

