package com.lily;

public class Overloading11 {
    static void main() {
//fun(2);
//fun(5,6);

//        System.out.println( sum(4,5));
//        int ans = sum(1,2,3);
//        System.out.println(ans);
//        sum();   // error - ambiguity

    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b,int c){
        return a + b + c;
    }


    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a);
    }

}

