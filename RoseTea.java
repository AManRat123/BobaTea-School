class RoseTea extends BobaTea {

    private boolean crushedRosePetals;

    public RoseTea(boolean crushedRosePetals) {
        this.crushedRosePetals = crushedRosePetals;
        basePrice = 4.49;
    }


    public void crushRosePetals() {
        this.crushedRosePetals = true;
    }

    public String toString() {
        return super.toString() + ", rose petals " + (crushedRosePetals ? "crushed" : "whole");
    }

}