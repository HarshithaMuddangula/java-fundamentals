package com.lily;
import java.util.Scanner;

public class Typecasting06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type conversion
        /* Rules - 1. 2 types should be compatible
                   2. destination type should be greater than source type
                        left side > right side ,eg. float > int
                        small data type to large datatype
         */
//        float num = input.nextInt();      //i-3 , o-3.0
//        int num = input.nextFloat();    //error
//        int num = input.nextInt();          //i-3.4 ,o-error
//        System.out.println(num);
//        int num = 56;
//        System.out.println(num);        //o-56

        //type casting or narrowing conversion
            /* large datatype to small datatype
                    float -> int */
//        int num = 12.45;  //error
//        int num = (int) 12.45f;
//        System.out.println(num);        //o-12

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);      //i-257,o-1 ; 257%256=1

//        byte a = 50;
//        byte b = 40;
//        byte c = 50;
//        int d =a * b + c;
//        System.out.println(d);      //2050
        /* the result of intermediate expression a * b easily exceeds the range of byte
            to handle this, java automatically promotes each byte to int or whatever type we use in code*/

//        byte b = 10;
//        b =  (b * 2); //error
        /* u can assign byte to an int but how can u assign an int to a byte
           bcz byte is smaller than int */

        //- ASCII - American Standard Code for Information Interchange
//        int number = 'a';       //97
//        int number = 'A';           //65
//        System.out.println(number);

        //java follows unicode principles
//        System.out.println("నమస్తే");       //నమస్తే
//        System.out.println("こんにちは");        //こんにちは

        /* rules for automatic promotion in expressions
        1. all byte,char,short are promoted to int.
        2. if any one of the operands is long,whole operation is promoted to long
             i.e., the large datatype */

//        byte b = 56;
//        char c = 'r';
//        short s = 4567;
//        int i = 1234;
//        long l = 12345678L;
//        float f = 34.76f;
//        double d = 3456.6782;
//        double result = (f * i) + (d / c) - (s * l) + (b * 2);
//        // float + double + long + int = double
//        System.out.println((f * i) + " " + (d / c) + " " + (s % l) + " " + (b * 2));
//        System.out.println(result);
        /* 42893.84 30.321738596491226 4567 112
            38469.16158234649 */

    }
}
