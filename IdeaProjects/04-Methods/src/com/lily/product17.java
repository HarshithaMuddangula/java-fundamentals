package com.lily;

import java.util.Scanner;

public class product17 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = into(a,b);
        System.out.println(ans);
    }
    // Define a method that returns the product of two numbers entered by user.
    static int into(int a ,int b){
        return a * b;
    }
}
