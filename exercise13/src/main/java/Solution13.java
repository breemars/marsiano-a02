/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution13 {
    /*
    calculate compound interest
    - ask user for principal, rate, years, and times the interest is compounded
    - calculate the compound interest ( A = P(1 + r/n)^(n*t) )
    - print how much the investment will be worth
     */

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int times = input.nextInt();

        //calculate interest
        double total = Math.round(100.0 * principal * Math.pow((1 + (rate / 100 / times)), times * years)) / 100.0;

        //OUTPUT
        System.out.println("$" + principal + " invested at " + rate + "% for " +
                years + " compound " + times + " times per year is $" + total + ".");
    }

}
