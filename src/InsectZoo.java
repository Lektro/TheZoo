public abstract class InsectZoo extends Zoo {

    /** Class Variables */
    private Butterfly[] butterflies;

    /** Constructor */
    public InsectZoo() {
        butterflies = new Butterfly[0];
    }

    /** get butterflies */
    public Butterfly[] getButterflies() {
        return butterflies;
    }

    /** Set butterflies */
    public void setButterflies(Butterfly[] butterflies) {
        this.butterflies = butterflies;
    }
}

// Species: Monarch, Glass winged, Leopard Lacewing.
