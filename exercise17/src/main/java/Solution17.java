/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution17 {
    /*
    blood alcohol calculator
    - prompt for weight, gender, alcohol consumed, and time passed
    - catch error so that only numerical numbers are entered
    - calculate BAC (= A * 5.14 / W * r) - 0.015 * H
    - print if user can legally drive or not
     */

    public static void main(String[] args){
        int gender, ounces, weight, hours;

        //Ensure that only numerical numbers are entered
        while (true) {
            try {
                //INPUT
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
                gender = input.nextInt();
                System.out.print("How many ounces of alcohol did you have? ");
                ounces = input.nextInt();
                System.out.print("What is your weight. in pounds? ");
                weight = input.nextInt();
                System.out.print("How many hours has it been since your last drink? ");
                hours = input.nextInt();
                break;

            } catch (InputMismatchException e) {
                //Catch an error if the user doesn't enter a valid number
                System.out.println("Input must be a valid number!");
            }
        }

        //Calculate BAC
        double BAC = (ounces * 5.14 / weight * (gender == 1 ? 0.73 : 0.66)) - (0.015 * hours);

        //OUTPUT - ternary operator - is BAC 0.08 or greater?
        System.out.printf("\nYour BAC is %.6f\n", BAC);
        System.out.print(BAC >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive.");
    }
}