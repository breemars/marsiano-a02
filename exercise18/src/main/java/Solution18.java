/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution18 {
    /*
    temperature converter
    - prompt for type of conversion and temp
    - convert to different type of temperature
    -- C = (F − 32) × 5 / 9
    -- F = (C × 9 / 5) + 32
    - print result
     */

    public static void main(String[] args){

        //INPUT - get type of conversion
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n");
        char type = input.next().charAt(0);

        //OUTPUT - prints choice type
        System.out.print("Your choice: " + type);

        //Get value of temperature, convert, and print result
        if(type == 'C' | type == 'c') { //F to C
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            int temp = input.nextInt();
            temp = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + temp);

        }else if(type == 'F' | type == 'f') { //C to F
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = input.nextInt();
            temp = (temp * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + temp);
        }

    }
}