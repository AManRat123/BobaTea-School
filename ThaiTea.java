class ThaiTea extends BobaTea {

    private double spiceAmount;

    public ThaiTea(double spiceAmount) {
        this.spiceAmount = spiceAmount;
    }

    public String toString() {
        return super.toString() + ", with " + spiceAmount + " spices";
    }

}