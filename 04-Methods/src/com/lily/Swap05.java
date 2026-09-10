package com.lily;

public class Swap05 {
    static void main() {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;
        System.out.println(a +" , "+b);     //  swapped
                swap(a,b);          //did not swap
        String name = "Harshitha";
         changeName(name);
        System.out.println(name);

    }
    static void changeName(String name){
        name = "Lily";
    }

    static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
