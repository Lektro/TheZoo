
public abstract class Animals extends Zoo {

    /** Class variables */
    public String name;
    public int age;
    public double weight;
    public char sex;
    public String color;

    /** default constructor */
    public Animals(){}

    /** Constructor with all variables */
    public Animals(String name, int age, int weight, char sex, String color){}


    /** getters and setters for variables */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
