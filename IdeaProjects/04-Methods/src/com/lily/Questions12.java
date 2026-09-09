package com.lily;

import java.util.Scanner;

public class Questions12 {
    static void main() {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(prime(n));
//        System.out.println(armstrong(n));

        //  print all the 3 digit armstrong numbers
        for(int i = 100;i < 1000;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }

    }
        // check if 3 digit number is armstrong or not
    static boolean armstrong(int n){
        int o = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n /= 10;
            sum += rem* rem* rem;
        }
        if(sum == o){
            return true;
        }
        return false;
    }

     static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
     }

}
