/*
 *  UCF COP3330 Fall 2021 Exercise 12 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class ComputingInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principle = scan.nextDouble();
        System.out.print("Enter the interest rate: ");
        double rate = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        double finalAmount = principle * (1 + ((rate / 100) * years));

        System.out.println(String.format("After %d years at %.2f percent interest, the investment will be worth %.2f", years, rate, finalAmount));
    }
}
