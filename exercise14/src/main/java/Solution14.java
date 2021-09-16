/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution14 {
    /*
    tax calculator
    - ask user for order amount
    - ask user which state they're from
    - IF user is from WI
    -- calculate tax
    -- print subtotal and tax
    - print total for every user
     */

    public static void main(String[] args){
        double tax = 0;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double cost = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();

        //Add tax if the state is WI
        if(state.equals("WI")){
            System.out.printf("The subtotal is $%.2f.\n", cost);

            //Calculate tax
            tax = 0.055 * cost;
            System.out.printf("The tax is $%.2f.\n", tax);
        }

        //OUTPUT final amount
        System.out.printf("The total is $%.2f.", (cost + tax));

        }
}
