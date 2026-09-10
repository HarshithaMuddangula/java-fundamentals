package com.lily;



public class Shadowing09   {
    static int x = 30;
    static void main() {
        System.out.println(x);
        int x = 70;             //2 scopes are overlaping,the variable with higher level scope is hidden
         System.out.println(x);
        fun();
    }
    static void fun(){
        int x = 8;
        System.out.println(x);

    }
}
