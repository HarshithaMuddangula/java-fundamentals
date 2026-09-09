package com.lily;

import java.util.Arrays;

public class VarArgs10 {
    static void main() {
        // if we use variable length arguments, we can pass any number of arguments
        // the length is not constant,it varies according to our input
//    fun(1,2,4,3,45,6,72,56,36,3,5,7,2,7,36,7,8,3);

//    demo(1,2,4,56,7,4,6,3,4,56,75,43);
//        demo();        // error - ambiguity




    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
