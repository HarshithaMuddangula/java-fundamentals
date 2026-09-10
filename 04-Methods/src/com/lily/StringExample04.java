package com.lily;

import java.util.Scanner;

public class

StringExample04 {
    static void main() {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String naam = in.next();
        String msg = mygreet(naam);
        System.out.println(msg);
    }
    // if u give return_type as String ,u should return String,Otherwise it'll give error
    static String mygreet(String name){
        String wish = "Hello " +name;
        return wish;
    }

    static String greet(){
        String greeting = "How are You";
        return greeting;
    }
}
