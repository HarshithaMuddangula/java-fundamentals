package com.lily;

import java.util.Scanner;

public class Assignment4 {
    static void main() {
        Scanner in = new Scanner(System.in);

    }
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
    static String check(int a) {
        if(a % 2 == 0)return"even";
        return"odd";
    }
    static boolean voter(int age){
        return age >= 18;
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int into(int a ,int b){
        return a * b;
    }
    static double area(float r) {
        return  Math.PI * r * r;
    }
    static double circumference(float r) {
        return  2 * Math.PI * r;
    }
    static boolean isPrime(int n){
        if(n <= 1)return false;
        int c = 2;
        while(c * c <= n){
            if(n % c == 0)return false;
            c++;
        }
        return true;
    }
    static void primeNumbers(int a,int b){
        for (int n = a; n <= b; n++) {
            if (isPrime(n)) System.out.println(n);
        }
    }
    static String grade(int marks){
        if(marks > 100 || marks < 0 ) return"Invalid";
        if(marks >= 91 ) return"AA";
        if(marks >= 81 ) return"AB";
        if(marks >= 71 ) return"BB";
        if(marks >= 61 ) return"BC";
        if(marks >= 51 ) return"CD";
        if(marks >= 41 ) return"DD";
        return"Fail";
    }
    static long fact(int n){
        long ans = 1;
        while (n >= 1) {
            ans = ans * n;
            n--;
        }
        return ans;
    }
    static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev == original;
    }
    static boolean isPythagoreanTriplet(int a,int b,int c){
        a = a*a;
        b = b*b;
        c = c*c;
        if(a == b + c)return true;
        if(b == a + c)return true;
        return c == a + b;
    }
    static int sumOfN(int n){
        int sum = 0;
        while(n > 0){
            sum+=n;
            n--;
        }
        return sum;
    }
}
