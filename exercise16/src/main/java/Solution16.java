/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution16 {
    /*
    can user drive legally?
    - ask user for age
    if: user 16 or older
    - user can drive
    else: user too young
    - user cannot drive
     */

    public static void main(String[] args){

        //INPUT - ask user for age
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();

        //OUTPUT - ternary operator - is user 16 or older?
        System.out.print(age >= 16 ? "You are old enough to legally drive" : "You are not old enough to legally drive");

    }
}