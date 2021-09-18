/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution11 {
    /*
    convert currency
    - ask user for euros and exchange rate
    - print and calculate us dollars
     */

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        int euros = input.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        //OUTPUT
        System.out.println(euros + " euros  at an exchange rate of " + rate + " is\n"
                + getTotal(euros, rate) + " U.S. dollars");
    }

    //calculate dollars
    private static double getTotal(int euros, double rate) {
        return Math.round((euros * rate * 100.0)) / 100.0;
    }

}
