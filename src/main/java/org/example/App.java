package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String str1 = scan.nextLine();
        System.out.print("What is the second number? ");
        String str2 = scan.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, sum, num1, num2, diff, num1, num2, product, num1, num2, quotient);
    }
}
