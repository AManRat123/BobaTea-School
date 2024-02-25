class ButterflyTea extends BobaTea {

    private int fairyDustAmount;

    public ButterflyTea(int fairyDustAmount) {
        this.fairyDustAmount = fairyDustAmount;
        this.basePrice = 4.49;
    }


    public void addFairyDust() {
        sugarAmount += fairyDustAmount;
    }

    public String toString() {
        return super.toString() + ", with " + fairyDustAmount + " fairy dust";
    }

}