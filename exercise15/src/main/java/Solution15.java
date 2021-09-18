/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution15 {
    /*
    password validation
    - prompt for username and password
    - ask user for password
    if: password correct
    - say Welcome
    else: password incorrect
    - say I don't know you
     */

    public static void main(String[] args){

        //INPUT - user creates username and password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = input.next();
        System.out.print("Enter a password: ");
        String password = input.next();

        //INPUT - user guesses what the password is
        System.out.print("\nHello " + username + "!\nWhat is a password? ");
        String guess = input.next();

        //OUTPUT
        if(guess.equals(password)){
            System.out.print("Welcome!");
        }else{
            System.out.print("I don't know you.");
        }
    }
}