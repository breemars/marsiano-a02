/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution09 {
    /*
    Calculate paint area
    - ask user for length and width
    - calculate area and find gallons
    - round upwards
    - print out how many gallons needed
     */

    public static final double CONVERT = 350;

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room? ");
        int width = input.nextInt();

        //Calculate total gallons
        double total = Math.ceil(((length * width) / CONVERT));

        //OUTPUT
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.",
                total, width * length);
    }

}
