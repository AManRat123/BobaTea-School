import java.util.ArrayList;

class BobaTea {

    public double price;
    public boolean addBoba;
    public String bobaType;
    public int sugarAmount;
    public int iceAmount;

    public static double totalSales;
    public static int totalOrders;
    public static ArrayList<BobaTea> allOrders = new ArrayList<>();

    // Getters and Setters

    public double getPrice() {
        return price;
    }

    public double basePrice;

    public double getBasePrice() {
        return basePrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAddBoba() {
        return addBoba;
    }

    public void setAddBoba(boolean addBoba) {
        this.addBoba = addBoba;
    }

    public String getBobaType() {
        return bobaType;
    }

    public void setBobaType(String bobaType) {
        this.bobaType = bobaType;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public int getIceAmount() {
        return iceAmount;
    }

    public void setIceAmount(int iceAmount) {
        this.iceAmount = iceAmount;
    }

    // Constructors

    public BobaTea() {
        basePrice = 3.99;
        addBoba = false;
        bobaType = "None";
        sugarAmount = 0;
        iceAmount = 0;
    }

    public BobaTea(double price, boolean addBoba, String bobaType,
                   int sugarAmount, int iceAmount) {
        this.price = price;
        this.addBoba = addBoba;
        this.bobaType = bobaType;
        this.sugarAmount = sugarAmount;
        this.iceAmount = iceAmount;
    }

    // Order Tracking Methods

    public static void addOrder(BobaTea order) {
        totalSales += order.getPrice();
        totalOrders++;
        allOrders.add(order);
    }

    public String toString() {
        return this.getClass().getSimpleName() + ": $" + price + ", " + sugarAmount + "% sugar, " +
                iceAmount + "% ice";
    }

}