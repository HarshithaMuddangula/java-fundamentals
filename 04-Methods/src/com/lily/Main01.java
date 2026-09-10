package com.lily;

import java.util.Scanner;

public class Main01{
    static void main(){
        Scanner in = new Scanner(System.in);
        //Functions are called methods in java
        //Functions in classes are called Methods

        //sum of 2 numbers
        int a, b, sum;
        System.out.println("Enter number 1: ");
        a = in.nextInt();
        System.out.println("Enter number 2: ");
        b = in.nextInt();
        sum = a + b;
        System.out.println("sum = "+sum);
    }
}