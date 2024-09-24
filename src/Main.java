import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double BREAK_OVER_PRICE = 100.00;
        final double SHIPPING_PERCENT = 0.02;
        double itemPrice = 0.00;
        double shippingCosts = 0.00;
        double totalPrice = 0.00;
        String trash = "";


        System.out.print("Enter the price of your item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            System.out.println("\nPlease run the program again.");
            System.exit(0);
        }

        if (itemPrice >= BREAK_OVER_PRICE) {
            shippingCosts = 0.00;
            totalPrice = itemPrice + shippingCosts;
            System.out.println("\nYour shipping costs are worth " + shippingCosts + " dollars and your total price is worth " + totalPrice + " dollars.");
        }
        else {
            shippingCosts = itemPrice * SHIPPING_PERCENT;
            totalPrice = itemPrice + shippingCosts;
            System.out.println("\nYour shipping costs are worth " + shippingCosts + " dollars and your total price is worth " + totalPrice + " dollars.");
        }
    }
}

