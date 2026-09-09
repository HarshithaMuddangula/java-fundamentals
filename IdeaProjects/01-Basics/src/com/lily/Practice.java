package com.lily;

import java.util.Scanner;

public class Practice {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int o = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return sum == o;
    }
}