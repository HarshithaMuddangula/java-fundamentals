package com.lily;

import java.util.Scanner;

public class Temperature08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float C = input.nextFloat();
//        double F = (C * 1.8) + 32;
        double F = (C * 9/5) + 32;
        System.out.println("The temp given " +C +" in celsius is "+ F + " in Fahrenheit");
        /* Please enter temp in C: 40
            The temp given 40.0 in celsius is 104.0 in Fahrenheit */
            }
}
