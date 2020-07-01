import java.util.Arrays;

public class Aquaria extends Zoo {

    /** class variable's */
    private Cichlid [] cichlids;


    /** Constructors */
    public Aquaria() {
        cichlids = new Cichlid[0];


    }
    /** auto-gen get and set */

        public Cichlid[] getCichlids() {
            return cichlids;
        }

        public void setCichlids(Cichlid[] cichlids) {
            this.cichlids = cichlids;
        }

    @Override
    public void addAnimals(Animals animal) {

    }

    @Override
    public void printAllZooAnimals() {
        System.out.println("All the fishes in the Aquarium are: " + getCichlids());
    }
}




