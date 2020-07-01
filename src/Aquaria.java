import java.util.Arrays;

public class Aquaria extends Zoo {

    /** class variable's */
    private Cichlid [] cichlids;


    /** Constructors */
    public Aquaria() {
        this.cichlids = new Cichlid[0];


    }
    /** auto-gen get and set */

        public Cichlid[] getCichlids() {
            return this.cichlids;
        }

        public void setCichlids(Cichlid[] cichlids) {
            this.cichlids = cichlids;
        }

    @Override
    public void addAnimals(Animals animal) {

    }


    public void printAllZooAnimals() {
        System.out.println("All the fishes in the Aquarium are:" + cichlids.length);

        for (int i = 0; i < this.cichlids.length ; i++) {
            System.out.println("Printing number: " + i);
            System.out.println(animal());
        }
//        for (Cichlid c : cichlids) {
//            System.out.println(c.getName() + " " + c.getAge());
//
//        }
    }
}




