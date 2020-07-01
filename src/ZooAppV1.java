public class ZooAppV1 {

    public static void main(String[] args) {

        /** create the zoo */
        Aquaria aquaria = new Aquaria();

        /** Create the fish */
        Cichlid cichlid = new Cichlid();
        Cichlid cichlid2 = new Cichlid();

        /** Name the animal */
        cichlid.setName("Fronske");
        cichlid2.setName("Benny");
        cichlid.setAge(32);
        cichlid.setSex('M');
        cichlid.setFromLakeMalawi(true);

        /** add animal to correct zoo */
        aquaria.addAnimals(cichlid);
        aquaria.addAnimals(cichlid2);

        aquaria.printAllZooAnimals();
    }
}
