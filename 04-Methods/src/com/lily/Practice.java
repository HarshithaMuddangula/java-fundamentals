package com.lily;

import java.util.Scanner;

public class Practice {
    static void main() {
        Scanner in = new Scanner(System.in);
        /* int sum = 0;
        while(true){
            int n = in.nextInt();
            if( n == 0)break;
            sum = summ(sum,n);
        }
        System.out.println(sum);*/
        int n = in.nextInt();
        fibo(n);
    }
    static void fibo(int n){
        int a = 0;
        int b = 1;
        int i = 0;
        while(n > 0){
            System.out.print(a+" ");
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
    }
    static int sumProduct(int n){
        int sum = 0;
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        return product - sum;
    }
    static int summ(int sum, int n) {
        sum += n;
        return sum;
    }

    static boolean perfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0)sum += i;
        }
        return n == sum;
    }
    static int hCf(int a, int b){
        int h = Math.min(a,b);
        while(a % h != 0 || b % h != 0){
            h--;
        }
        return h;
    }
    static double expo(int m , int n){
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
    static boolean leapyear(int n){
        return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
    }
    static boolean strong(int n){
        int original = n;
        int digits = 0;
        while(n > 0){
            n /= 10;
            digits++;
        }
        n = original;
        int sum = 0;
        while(n > 0){
            int rem = n % 10 ;
            int digitpower = 1;
            for (int i = 0; i < digits; i++) {
                digitpower = digitpower * rem;
            }
            sum += digitpower;
            n /= 10;
        }
        return sum == original;
    }
    static void nCr(int n , int r){
        int m = n - r;
        double nf =1;
        double rf =1;
        double mf =1;
        for (int i = 1; i <= n ; i++) {
            nf = nf * i;
        }
        for (int i = 1; i <= r ; i++) {
            rf = rf * i;
        }
        for (int i = 1; i <= m ; i++) {
            mf = mf * i;
        }
        System.out.println(nf / mf);
        System.out.println(nf/(rf * mf));
    }
    static int lCm(int a,int b){
        int l = Math.max(a,b);
        while(l % a != 0 || l % b != 0){
            l++;
        }
        return l;
    }
    static int sumDigits(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
    static long fact(int n){
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    static String StringReverse(String word){
        int i = word.length()-1;
        String rev = "";
        while(i >= 0){
            rev = rev + word.charAt(i);
            i--;
        }
        return rev;
    }
    static double kunalOuting(){
        int count = 0;
        int totaldays = 31;
        for (int i = 1; i <= totaldays ; i++) {
            if(i % 2 == 0)count++;
        }
        return count;
    }
    static double bill(int units) {
        double sum = 0;
        if (units <= 100) sum = units * 3.0;
        else if (units <= 200) sum = (100 * 3.0) + (units - 100) * 4.5;
        else sum = (100 * 3.0) + (100 * 4.5) + (units - 200) * 6.0;
        return sum += 50;
    }
    static String grade(int n){
        if(n > 100 || n < 0)return "invalid";
        if(n >= 91) return "AA";
        if(n >= 81) return "AB";
        if(n >= 71) return "BB";
        if(n >= 61) return "BC";
        if(n >= 51) return "CD";
        if(n >= 41) return "DD";
        return "fail";

    }
    static boolean eligibility(int age){
        return age >= 18;
    }
    static String caseCHeck(char alphabet){
        if(alphabet >= 'a' && alphabet <= 'z')return "Lowercase";
        if(alphabet >= 'A' && alphabet <= 'Z')return "Uppercase";
        return "Invalid Input";
    }
    static double calci(char op,float a,float b){
        if(op == '+') return a + b;
        if(op == '-') return a - b;
        if(op == '*') return a * b;
        if(op == '/') return a / b;
        return a % b;
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