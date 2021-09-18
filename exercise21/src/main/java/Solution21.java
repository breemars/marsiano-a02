/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution21 {
    /*
    convert numbers to months
    - prompt for number of month
    - throw an error message if invalid number
    - else print which month it is
     */

    public static void main(String[] args){

        //INPUT - number of month
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int num = input.nextInt();

        if(num < 1 || num > 12)
            //Throw error message
            System.out.print("Invalid number");
        else
            //Convert to month and OUTPUT result
            System.out.print("The name of the month is " + convertToMonth(num));
    }

    //Takes in a number and converts to the String month
    private static String convertToMonth(int num) {
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }
}
