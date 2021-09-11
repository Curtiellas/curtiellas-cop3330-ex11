package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        float euros = sc.nextFloat();

        System.out.println("What is the exchange rate?");
        float rate = sc.nextFloat();

        //calculate
        float dollars = euros * rate;

        System.out.printf("%.0f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, rate, dollars);
    }
}
