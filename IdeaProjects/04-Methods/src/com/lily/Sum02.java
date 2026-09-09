package com.lily;

import java.util.Scanner;

public class Sum02  {
    static void main() {
        Scanner in = new Scanner(System.in);
        /*
        method format / syntax:
        return_type name(arguments){
            //body
            return statement;
         */

//        sum();        //prints whats in println
//        sum2();         //got the value ,but no one told it to print
//        System.out.println(sum2());     //we can call the method directly
//        int ans = sum2();       // store it in a variable
//        System.out.println(ans);      // then print is
//        int ans = sum3(1,5);          //we can pass parameters in brackets
//        System.out.println(ans);

     }
    // pass the value, when u call the method in main
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        int a, b, sum;
        System.out.println("Enter number 1: ");
        a = in.nextInt();
        System.out.println("Enter number 2: ");
        b = in.nextInt();
        sum = a + b;
        System.out.println("sum = " + sum);

    }

    // we want to return a value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        int a, b, sum;
        System.out.println("Enter number 1: ");
        a = in.nextInt();
        System.out.println("Enter number 2: ");
        b = in.nextInt();
        sum = a + b;
        return sum;
//        System.out.println("Lily");     //anything after return stmt is not executed
    }




}

