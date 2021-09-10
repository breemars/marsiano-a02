/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    /*
    Output retirement age
    - ask user for their age
    - ask user when they would like to retire
    - calculate how long until then
    - get the current year
    - output when they can retire
     */
    public static void main(String[] args){

        //IN - Asks the user for their age and retirement age
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = input.nextInt();
        System.out.print("What age would you like to retire? ");
        int retire = input.nextInt();

        //Calculate years until then
        int range = retire - age;

        //Get current year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //OUT - Prints out when user can retire
        System.out.println("You have " + range + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in " + (year + range) + ".");

    }

}
