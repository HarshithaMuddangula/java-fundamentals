package com.lily;

public class Scope08 {
    static void main() {
        int a = 10;    //u can access a only in this method
        int b = 9;
//        int a = 98;   // u cannot initialize a variable more than once in a function
//        System.out.println(num);
//        System.out.println(num1);
        String name = "Harshitha";
        System.out.println(name);
        {
//            int a = 3;   // a is already initialized in this function
            a = 9;
            int c = 0;
//            System.out.println(a);
            name = "Lily";
            System.out.println(name);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int e = 45;
            a = 45;
        }
//        e = 66;
//        System.out.println(i);
//        c = 8;
//        System.out.println(a);
//        System.out.println(name);

    }
//    static void random(int num){
//        System.out.println(a);  //a defined in another method cannot be accessed in this method.
//     int num1 = 6;
//    }
}
