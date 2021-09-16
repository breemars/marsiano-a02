/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution10 {
    /*
    self-checkout
    - get prices and quantities of 3 different items
    - calculate the subtotal, tax, and total
    - print out final results
     */

    public static final double TAX = 0.055;

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        int price1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        int price2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        int price3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = input.nextInt();

        //calculate subtotal, tax, and total amount
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = subtotal * TAX;
        double total = subtotal + tax;

        //OUTPUT
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",
                subtotal, tax, total);
    }

}
