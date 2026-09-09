package com.lily;

import java.util.Scanner;

public class Assignment4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0)return;
        int large = n;
        while (true) {
            if(n == 0) break;
            n = in.nextInt();
            large = largest(large,n);
        }
        System.out.println(large);
    }
    static int largest(int large,int n){
        if(n > large)return n ;
        return large;
    }


}
