import java.util.*;

public class BobaShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        BobaTea order = null;
        ArrayList<BobaTea> orders = new ArrayList<>();
        double totalSales = 0;

        System.out.println("Create Boba Order");
        while (run) {
            System.out.print("Enter tea type (BMT, Rose, Butterfly, Thai): ");
            String teaType = sc.next();

            if (teaType.equalsIgnoreCase("BMT")) {
                System.out.print("Enter steep time: ");
                int steepTime = sc.nextInt();
                order = new BlackMilkTea(steepTime);
            } else if (teaType.equalsIgnoreCase("Rose")) {
                System.out.print("Crushed rose petals? (y/n): ");
                boolean crushed = sc.next().equalsIgnoreCase("y");
                order = new RoseTea(crushed);
            } else if (teaType.equalsIgnoreCase("Butterfly")) {
                System.out.print("Enter fairy dust amt: ");
                int dustAmt = sc.nextInt();
                order = new ButterflyTea(dustAmt);
            } else if (teaType.equalsIgnoreCase("Thai")) {
                System.out.print("Enter spice amount: ");
                double spiceAmt = sc.nextDouble();
                order = new ThaiTea(spiceAmt);
            }
            System.out.print("Customize order: ");

            System.out.print("Add boba? (y/n): ");
            boolean addBoba = sc.next().equalsIgnoreCase("y");

            if (addBoba) {
                if (teaType.equalsIgnoreCase("BMT")) {
                    order.setBobaType("honey");
                } else if (teaType.equalsIgnoreCase("butterfly")) {
                    System.out.print("Boba type (crystal, jelly): ");
                    String bobaType = sc.next();
                    order.setBobaType(bobaType);
                } else {
                    System.out.print("Boba type (honey, crystal, jelly): ");
                    String bobaType = sc.next();
                    order.setBobaType(bobaType);
                }
            }

            System.out.print("Enter sugar amount (%): ");
            int sugarAmt = sc.nextInt();
            order.setSugarAmount(sugarAmt);

            System.out.print("Enter ice amount (%): ");
            int iceAmt = sc.nextInt();
            order.setIceAmount(iceAmt);

            // Implement tiered pricing
            double basePrice = order.getBasePrice();
            double price = basePrice;
            if (addBoba) {
                price += 0.5;
            }
            order.setPrice(price);

            // Print order details
            System.out.println(order);

            // Track order
            orders.add(order);
            totalSales += order.getPrice();

            // Print updated totals
            System.out.println("Total orders: " + orders.size());
            System.out.println("Total sales: " + totalSales);

            // Take inputs to modify order
            System.out.print("Update order? (y/n): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("n")) {
                run = false;
            }
        }

        // print final order
        System.out.println(orders);
        System.out.println("Total orders: " + orders.size());
        System.out.println("Total sales: " + totalSales);
    }
}