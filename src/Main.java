import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DO FIRST IF THEN TO TEST FOR INPUT VALIDITY (double or trash)--use exit statement
        //SECOND IF THEN IS FOR TESTING RANGE OF VALUES (less than 100, etc.)


        Scanner in = new Scanner(System.in);
        final double BREAK_OVER_PRICE = 100.00;
        final double SHIPPING_PERCENT = 0.02;
        double itemPrice = 0.00;
        double shippingCosts = 0.00;
        double totalPrice = 0.00;
        String trash = "";

        //output “Enter the price of your item: ”

        System.out.println("Enter the price of your item: ");

        //input itemPrice
        //if itemPrice >= BREAKOVER_PRICE then
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Please enter a numeric value. You entered: " + trash + ".");
            System.out.println("Please run the program again.");
            System.exit(0);
        }

        if (itemPrice >= BREAK_OVER_PRICE) {
            shippingCosts = 0.00;
            totalPrice = itemPrice + shippingCosts;
            System.out.println("Your shipping costs are worth " + shippingCosts + " dollars and your total price is worth " + totalPrice + " dollars.");
        }
        else {
            shippingCosts = itemPrice * SHIPPING_PERCENT;
            totalPrice = itemPrice + shippingCosts;
            System.out.println("Your shipping costs are worth " + shippingCosts + " dollars and your total price is worth " + totalPrice + " dollars.");
        }
    }

    //	shippingCosts = 0.00
    //	totalPrice = itemPrice + shippingCosts
    //output “Your shipping costs are worth ” + shippingCosts + “ dollars and your total price is worth ” + totalPrice + “ dollars.”
    //else
    //	shippingCosts = itemPrice * SHIPPING_PERCENT
    //	totalPrice = itemPrice + shippingCosts
    //output “Your shipping costs are worth ” + shippingCosts + “ dollars and your total price is worth ” + totalPrice + “ dollars.”
    //endIf
}

