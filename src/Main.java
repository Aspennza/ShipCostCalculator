import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double BREAK_OVER_PRICE = 100.00;
        final double SHIPPING_PERCENT = 0.02;
        double itemPrice = 0.00;
        double shippingCosts = 0.00;
        double totalPrice = 0.00;

        //output “Enter the price of your item: ”

        System.out.println("Enter the price of your item: ");

        //input itemPrice
        //if itemPrice >= BREAKOVER_PRICE then
        //	shippingCosts = 0.00
        //	totalPrice = itemPrice + shippingCosts
        //output “Your shipping costs are worth ” + shippingCosts + “ dollars and your total price is worth ” + totalPrice + “ dollars.”
        //else
        //	shippingCosts = itemPrice * SHIPPING_PERCENT
        //	totalPrice = itemPrice + shippingCosts
        //output “Your shipping costs are worth ” + shippingCosts + “ dollars and your total price is worth ” + totalPrice + “ dollars.”
        //endIf
    }
}