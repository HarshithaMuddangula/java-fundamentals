package com.lily;

import java.util.Scanner;

public class Practice {
    static void main() {
        Scanner in = new Scanner(System.in);
        char letter = in.next().charAt(0);
        System.out.println(caseCheck(letter));
    }
    
    static String caseCheck(char letter){
        if (letter >= 'a' && letter <= 'z')return "Lowercase";
        if (letter >= 'A' && letter <= 'Z')return "Uppercase";
        return "invalid input";
    }
    static int digitCount(int n ,int m){
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == m) count++;
            n/= 10;
        }
        return count;
    }

    static double npr(int n,int r){
        int m = n - r;
        double nf = 1;
        long mf = 1;
        for(int i = 1;i <= n;i++){
            nf *= i;
        }
        for(int i = 1;i <= m;i++){
            mf *= i;
        }
        return nf/mf;
    }
    static double ncr(int n,int r){
        int m = n - r;
        double nf = 1;
        long mf = 1;
        double rf = 1;
        for(int i = 1;i <= n;i++){
            nf *= i;
        }
        for(int i = 1;i <= m;i++){
            mf *= i;
        }
        for(int i = 1;i <= r;i++){
            rf *= i;
        }
        return nf/(rf*mf);
    }

    static boolean isArmstrong(int n){
        int original = n;
        int digits = 0;
        while(n > 0){
            n /= 10;
            digits++;
        }
        n = original;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int digit = 1;
            for(int i = 0;i < digits;i++){
                digit = digit * rem;
            }
            sum += digit;
            n /= 10;
        }
        return sum == original;
    }
    static double power(int n,int m){
        double ans = 1;
        while(m > 0){
            ans *= n;
            m--;
        }
        while(m < 0){
            ans /= n;
            m++;
        }
        return ans;

    }
    static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
    static boolean leapYear(int y){
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
    static int lcm( int a,int b){
        int l =0;
        if(a > b){
            l = a;
        }else{
            l = b;
        }
        while(l % a != 0 || l % b != 0){
            l += 1;
        }
        return l;
    }

    static int hcf(int a, int b){
        int h;
        if(a < b){
            h = a;
        }else{
            h = b;
        }
        while(a % h != 0 || b % h != 0){
            h -= 1;
        }
        return h;
    }
    static boolean perfect(int n){
        int sum = 0;
        for(int i = 1;n > i;i++){
            if(n % i == 0) sum += i;
        }
        return sum == n;
    }
    static String reverse(String word){
        int i = word.length()-1;
        String rev = "";
        while(i >= 0){
            rev = rev + word.charAt(i);
            i--;
        }
        return rev;
    }
    static int revers(int n){
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}