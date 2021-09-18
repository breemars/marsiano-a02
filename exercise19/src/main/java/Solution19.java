/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Solution19 {
    /*
    BMI calculator
    - prompt for height and weight
    - wait until user enters valid numbers
    - calculate BMI
    - tell user if they are underweight, overweight, or average
     */

    public static void main(String[] args){
        double height, weight;

        //Do not let the user proceed until 2 valid numbers are entered
        while (true) {
            try {
                //INPUT - get height and weight
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your height (inches): ");
                height = input.nextDouble();
                System.out.print("Enter your weight (pounds): ");
                weight = input.nextDouble();
                break;

            } catch (InputMismatchException e) {
                //Catch an error if the user doesn't enter a valid number
                System.out.println("Input must be a valid number!");
            }
        }

        //Calculate BMI
        double bmi = getBMI(height, weight);
        System.out.printf("Your BMI is %.1f\n", bmi);

        //OUTPUT - is user overweight, underweight, or average?
        if(bmi >= 18.5 && bmi <= 25)
            System.out.print("You are within the ideal weight range.");
        else if(bmi > 25)
            System.out.print("You are overweight. You should see your doctor.");
        else
            System.out.print("You are underweight. You should see your doctor.");

    }

    private static double getBMI(double height, double weight) {
        return (weight / (height * height)) * 703;
    }
}