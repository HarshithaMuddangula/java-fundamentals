package com.lily;

import java.util.Scanner;

public class EvenOdd14 {
    static void main() {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        String ans = check(a);
        System.out.println(ans);
    }
    // Define a program to find out whether a given number is even or odd.
    static String check(int a) {
        if(a % 2 == 0)return"even";
        return"odd";
    }

}
