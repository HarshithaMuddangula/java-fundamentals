package com.lily;

import java.util.Scanner;

public class Inputs04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        System.out.print("Please enter an input:");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " +rollno);           //Your roll number is 16

//        int a = 10;        //ref var is called identifier,obj is called literal
//        int a = 234_000_000;
//        int b = 234000000;
//        System.out.println(a);              //23000000
//        System.out.println(b);              //23000000


//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " +rollno);         //Your roll number is 16

//        String name = input.nextLine();
//        System.out.println(name);           //I'll be unrecognizable

//        String name = input.next();
//        System.out.println(name);           //I'll

//        float marks = input.nextFloat();
//        System.out.println(marks);         //input-345.5678392 , output-345.56784
                                            //input-2 , output-2.0

//        double largeDecimals = input.nextDouble();
//        System.out.println(largeDecimals);        //  I-12345.12345 , O-12345.12345

//            long largeIntegers = input.nextLong();
//        System.out.print(largeIntegers);       // I-1234567891234578 , O-1234567891234578

        boolean check = input.nextBoolean();
        System.out.println(check);                  // true - true;false - false


        boolean heck = input.hasNextBoolean();
        System.out.println(heck);                   // true or false - true , anything else- false
    }
}
