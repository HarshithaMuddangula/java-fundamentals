package com.lily;

import java.util.Scanner;

public class Factorial20 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long f = fact(n);
        System.out.println(f);

    }
    static long fact(int n){
        long ans = 1;
        while (n >= 1) {
            ans = ans * n;
            n--;
        }
        return ans;
    }

}
