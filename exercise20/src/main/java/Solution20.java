/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution20 {
    /*
    tax calculator
    - ask user for order amount
    - ask user which state they're from
    - IF user is from WI
    -- increase tax rate
    -- ask for county
    -- IF Eau Claire/Dunn
    --- add more tax
    - IF user from IL
    -- increase tax rate
    - print total and tax
     */

    public static void main(String[] args){
        double taxRate = 0;

        //INPUT - amount and state
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double cost = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();

        //Add tax if the state is WI
        if(state.equals("Wisconsin")) {
            taxRate += 0.05;

            //Add tax based on county in WI
            System.out.print("What county do you live in? \n");
            input.nextLine();
            String county = input.nextLine();
            if (county.equals("Eau Claire")) {
                taxRate += 0.005;
            } else if (county.equals("Dunn")) {
                taxRate += 0.004;
            }
        }else if(state.equals("Illinois")) {
            //Add tax if state is IL
            taxRate += 0.08;
        }

        //Calculate tax
        double tax = taxRate * cost;

        //OUTPUT final amount
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, (cost + tax));

    }
}
