/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution07 {
    /*
    Area of a rectangular room
    - ask user for length and width
    - print the dimensions
    - calculate and print area in square feet and square meters
     */

    public static final double UNITS = 0.09290304;

    public static void main(String[] args){

        //IN - Asks the user for length and width
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        //Calculate feet and meters
        double feet = length * width;
        double meters = feet * UNITS;

        //OUTPUT
        System.out.printf("You entered %.0f feet by %.0f feet.\nThe area is\n%.0f square feet\n%.3f square meters", length, width, feet, meters);
    }

}
