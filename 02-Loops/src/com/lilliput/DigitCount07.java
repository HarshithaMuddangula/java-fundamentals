package com.lilliput;

import java.util.Scanner;

public class DigitCount07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = in.nextInt();
        int digits = 0;
        while(n > 0) {
          long  rem = n % 10;
          if ( rem == m){
              digits++;
          }
            n = n / 10;
        }

        System.out.println(digits);
    }
}
