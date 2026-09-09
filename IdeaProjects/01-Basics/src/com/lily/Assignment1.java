package com.lily;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Write a program to print whether a number is even or odd, also take input from the user.
//        System.out.print("Please enter a number: ");
//        int a = input.nextInt();
//        if (a % 2 == 0) {
//            System.out.println(a + " is an even number.");
//        }
//        else {
//                System.out.println( a + " is an odd number.");
//            }

        /* Please enter a number: 45
            45 is an odd number.
            Please enter a number: 5678
            5678 is an even number. */

        // Take name as input and print a greeting message for that particular name.
//        System.out.print("Please Enter Your Name:");
//        String name = input.next();
//        System.out.println("Hey " + name + "! Hope You Are Doing Good!!");

        /* Please Enter Your Name:Ajay
        Hey Ajay! Hope You Are Doing Good!! */

        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        System.out.print("Enter the Amount in Rupees:");
//            double P = input.nextDouble();
//        System.out.print("Enter the period of Time in Years:");
//            double T = input.nextDouble();
//        System.out.print("Enter the Rate of Interest in %:");
//            double R = input.nextDouble();
//            double S = (P * T * R) / 100;
//        System.out.println("The Simple Interest is " + S);

        /* Enter the Amount in Rupees:50000
        Enter the period of Time in Years:2
        Enter the Rate of Interest in %:5
        The Simple Interest is 5000.0 */

       // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.print("Enter your first number:");
//        double a = input.nextDouble();
//        System.out.print("Enter your second number:");
//        double b = input.nextDouble();
//        System.out.print("Enter an operator(+,-,*,/,%):");
//        char op = input.next().charAt(0);
//        System.out.print("The Output is ");
//        if ( op == '+'){
//            System.out.println( a + b);
//        }
//        else if ( op == '-'){
//            System.out.println(a - b);
//        }
//        else if ( op == '*'){
//            System.out.println(a * b);
//        }
//        else if ( op == '/'){
//            System.out.println(a / b);
//        }
//        else if ( op == '%'){
//            System.out.println(a % b);
//        }
//        else {
//            System.out.println("Invalid Operator");
//        }

        /* Enter your first number:4
            Enter your second number:9
            Enter an operator(+,-,*,/,%):+
            The Output is 13.0 */

        // Take 2 numbers as input and print the largest number.
//        System.out.print("Enter the first number:");
//        int a = input.nextInt();
//        System.out.print("Enter the second number:");
//        int b = input.nextInt();
//        System.out.print("The largest number is ");
//        if (a > b) {
//            System.out.println(a);
//        }
//        else {
//                System.out.println(b);
//            }
//        // System.out.print(Math.max(a, b));

        /* Enter the first number:23
            Enter the second number:21
            The largest number is 23 */

        // Input currency in rupees and output in USD.
//        System.out.print("Enter the currency in ₹:");
//        double R = input.nextDouble();
//        double U = R / 94.56;
//        System.out.println("The ₹ " + R + " is " + U + " in $");
        /*  Enter the currency in ₹:945600
            The ₹ 945600.0 is 10000.0 in $  */

        // To calculate Fibonacci Series up to n numbers.
//       int i = 1;
//       int a = 0;
//       int b = 1;
//        System.out.print("Please enter a number:");
//       int n = input.nextInt();
//       while ( i <= n ){
//           System.out.print(a);
//           i++;
//           int temp = a + b;
//           a = b;
//           b = temp;
//       }
       /* 0 1 1 2 3 5 8 13 */

        // To find out whether the given String is Palindrome or not.
//        System.out.print("Please enter a string: ");
//        String word = input.next();;
//        int start = 0;
//        int end = word.length() - 1;
//        while(start < end){
//            if (word.charAt(start) != word.charAt(end)){
//                System.out.println(word + " is not a Palindrome");
//                return;
//            }
//            else{
//                start++;
//                end--;
//            }
//        }
//        System.out.println(word +" is a Palindrome");

        /* Please enter a string: eye
            eye is a Palindrome
            Please enter a string: frog
            frog is not a Palindrome */

            // // To find out whether the given Number is Palindrome or not.
//        System.out.print("Please input a number: ");
//        int num = input.nextInt();
//        int original = num;
//        int reverse = 0;
//        while(num > 0){
//            int rem = num % 10;
//            reverse = (reverse * 10) + rem;
//            num = num / 10;
//        }
//        if ( original == reverse) {
//            System.out.println(original + " is a Palindrome.");
//        }
//        else{
//            System.out.println(original + " is not a Palindrome.");
//        }

        /* Please input a number: 123435
            123435 is not a Palindrome.
          Please input a number: 123454321
           123454321 is a Palindrome. */

        // To find Armstrong Number between two given number.
//        System.out.print("Please enter a number: ");
//        int num = input.nextInt();
//        int original = num;
//        int digits = 0;
//        while(num > 0){
//            num = num / 10 ;
//            digits++;
//        }
//        int sum = 0;
//        num = original;
//        while ( num > 0){
//            int digit = num % 10;
//            int digitpower = 1;
//            for (int i = 0; i < digits; i++) {
//                digitpower = digitpower * digit;
//            }
//            sum = sum + digitpower;
//            num = num / 10;
//        }
//        if(original == sum){
//            System.out.println(original+ " is an armstrong number.");
////        }
//        else{
//            System.out.println(original+ " is not an armstrong number.");
//        }
    }
    }
    /* Please enter a number: 153
        153 is an armstrong number.
        Please enter a number: 1634
        1634 is an armstrong number.
        Please enter a number: 123
        123 is not an armstrong number. */