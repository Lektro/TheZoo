public class Aquaria extends Zoo {

    /**
     * class variable's
     */
    private Cichlid[] cichlids;

    public Aquaria() {
        cichlids = new Cichlid[0];
    }

    /**
     * auto-gen get and set
     */
    public Cichlid[] getCichlids() {
        return cichlids;
    }

    public void setCichlids(Cichlid[] cichlids) {
        this.cichlids = cichlids;
    }

    @Override
    public void addAnimals(Animals animal) {

        if (animal instanceof Cichlid) {
            // System.out.println(cichlids.length);
            Cichlid[] result = new Cichlid[cichlids.length + 1];
            for (int i = 0; i < cichlids.length; i++) {
                result[i] = cichlids[i];
            }
            result[result.length - 1] = (Cichlid) animal;
            cichlids = result;

        }
    }

    @Override
    public void printAllZooAnimals() {
        System.out.println("All the fishes in the Aquarium are: ");

        //System.out.println(cichlids);

        for (Cichlid c : cichlids) {
            System.out.println(c.getName());
        }
    }
}




