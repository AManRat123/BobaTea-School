class BlackMilkTea extends BobaTea {

    private int steepTime;

    public BlackMilkTea(int steepTime) {
        this.steepTime = steepTime;
        addBoba = true;
        bobaType = "Honey";
    }

    public String toString() {
        return super.toString() + ", steeped for " + steepTime + " mins, with honey boba";
    }

}