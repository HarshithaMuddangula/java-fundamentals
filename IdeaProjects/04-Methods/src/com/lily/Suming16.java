package com.lily;

import java.util.Scanner;

public class Suming16 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a ,b;
        a = in.nextInt();
        b = in.nextInt();
        int ans = sum(a,b);
        System.out.println(ans);
    }
    static int sum(int a,int b){
        return a + b;
    }
}
