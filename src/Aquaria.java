public class Aquaria extends Zoo {

    /** class variable's */
    private Cichlid [] cichlids;
    // private Goldfish [] goldfishes;
    private Carp [] carps;

    /** Constructors */
    public Aquaria() {
        cichlids = new Cichlid[0];
        //goldfishes = new Goldfish[0];
        carps = new Carp[0];
    }
    /** auto-gen get and set */

        public Cichlid[] getCichlids() {
            return cichlids;
        }

        public void setCichlids(Cichlid[] cichlids) {
            this.cichlids = cichlids;
        }

        public Carp[] getCarps() {
            return carps;
        }

        public void setCarps(Carp[] carps) {
            this.carps = carps;
        }


    @Override
    public void addAnimals(Animals animal) {

    }

    @Override
    public void printAllZooAnimals() {

    }
}




