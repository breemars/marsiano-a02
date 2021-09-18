/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution23 {
    /*
    troubleshooting car issues
    - prompt the user for a series of questions
    - eventually reach an end and print out conclusion to their problem
     */

    public static void main(String[] args){

        //Begin Input Questions
        Scanner input = new Scanner(System.in);
        System.out.println("Enter y for Yes and n for No");

        System.out.print("Is the car silent when you turn the key? ");
        char ans = input.next().charAt(0);

        if(ans == 'y'){
            System.out.print("Are the battery terminals corroded? ");
            ans = input.next().charAt(0);
            if(ans == 'y')
                System.out.print("Clean terminals and try starting again.");
            else if(ans == 'n')
                System.out.print("Replace cables and try again.");

        }else if(ans == 'n'){
            System.out.print("Does the car make a slicking noise? ");
            ans = input.next().charAt(0);
            if(ans == 'y')
                System.out.print("Replace the battery.");
            else if(ans == 'n') {
                System.out.print("Does the car crank up but fail to start? ");
                ans = input.next().charAt(0);
                if(ans == 'y')
                    System.out.print("Check spark plug connections. ");
                else if(ans == 'n') {
                    System.out.print("Does the engine start and then die? ");
                    ans = input.next().charAt(0);
                    if(ans == 'y') {
                        System.out.print("Does your car have fuel injection? ");
                        ans = input.next().charAt(0);
                        if(ans == 'y')
                            System.out.print("Get it in for service. ");
                        else if(ans == 'n')
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }else if(ans == 'n')
                        System.out.print("This should not be possible.");
                }
            }
        }
    }
}
