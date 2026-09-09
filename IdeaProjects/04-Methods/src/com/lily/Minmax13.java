package com.lily;

import java.util.Scanner;

public class Minmax13 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int maxi = maximum(a,b,c);
        int mini = minimum(a,b,c);
        System.out.println(maxi);
        System.out.println(mini);
    }
    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    static int maximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }


    static int minimum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}