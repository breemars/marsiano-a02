/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution22 {
    /*
    get the biggest number
    - prompt for three numbers
    IF numbers aren't unique
    - throw error message
    ELSE
    - print the biggest
     */

    public static void main(String[] args){

        //INPUT numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        //Check for uniqueness
        if(num1 == num2 || num2 == num3 || num1 == num3)
            System.out.print("Numbers must all be unique");
        else
            //OUTPUT - Print the biggest number
            System.out.print("The largest number is: " + getBiggest(num3, getBiggest(num1, num2)));


    }

    //Return the biggest of two numbers
    private static int getBiggest(int one, int two){
        if(one > two)
            return one;
        return two;
    }
}
