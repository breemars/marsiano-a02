/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution08 {
    /*
    Calculate pizza
    - ask user for how many people
    - ask for how many pizzas
    - ask for how many slices
    - calculate and print out how many slices per person
     */

    public static void main(String[] args){

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt() * pizzas;

        //OUTPUT
        System.out.print(people + " people with " + pizzas + " pizzas (" + slices + " slices)" +
                "\nEach person gets " + slices/people + " pieces of pizza." +
                "\nThere are " + slices%people + " leftover pieces.");
    }

}
