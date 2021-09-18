/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution12 {
    /*
    calculate simple interest
    - ask user for principal, rate, and years
    - calculate the simple interest ( A = P(1 + rt) )
    - print how much the investment will be worth
     */

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        //OUTPUT
        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + getTotal(principal, rate, years) + ".");
    }

    private static long getTotal(int principal, double rate, int years) {
        return Math.round(principal * (1 + (rate / 100 * years)));
    }

}
