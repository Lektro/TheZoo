public class ZooAppV1 {

    public static void main(String[] args) {

        /** create the zoo */
        Aquaria aquaria = new Aquaria();

        /** Create the fish */
        Cichlid cichlid = new Cichlid();
        Cichlid cichlid2 = new Cichlid();

        /** Name the animal, set value's */
        cichlid.setName("Fronske");
        cichlid2.setName("Freddy");
        cichlid.setAge(32);
        cichlid.setSex('M');
        cichlid.setFromLakeMalawi(true);

        /** add animal to the aquarium */
        aquaria.addAnimals(cichlid);
        aquaria.addAnimals(cichlid2);

        /** prints out the array of all the animals */
        aquaria.printAllZooAnimals();
    }
}
