public class ZooAppV1 {

    public static void main(String[] args) {
        //System.out.println("Test");

        /** an Array of Animals can hold all kinds of objects, as long
        /** as they are subtypes of Animal */
        /** default Array for all the animals */

        /** create the zoo */
        Aquaria aquaria = new Aquaria();

        /** Create the fish */
        Cichlid cichlid = new Cichlid();

        /** Name the animal */
        cichlid.setName("Fronske");
        cichlid.setAge(32);
        cichlid.setSex('M');
        cichlid.setFromLakeMalawi(true);


        /** add animal to correct zoo */
        aquaria.addAnimals(cichlid);

         System.out.println(cichlid.getName());
        aquaria.printAllZooAnimals();
        // System.out.println(cichlid.name);
    }
}
