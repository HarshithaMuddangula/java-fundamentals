package com.lilliput;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1. use for loop when u know how many times the loop will run
        2. use while loop when u don't know how many times the loop will run
         */
        // for loop
        /* Syntax :
                for(initialization; condition ; increment/decrement){
                //body
                }
            ***** i++ can be writen as i+=1
         */
        //print 1 to 10
//        for (int i = 1; i <= 10; i+=2) {
//            System.out.print(i);               // o-12345678910
//        }

        //print 1 to n
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i += 1) {
//            System.out.print(i+ " ");            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
//            System.out.print(i);                 // 1234567891011121314151617
//        }

//        int m = in.nextInt();
//        for (int i = 0; i < m; i++) {
//            System.out.print("LILY THE GREAT" + "   ");         //LILY THE GREAT   LILY THE GREAT   LILY THE GREAT
//        }

        //while loops
        /* Syntax :
                while(condition){
                //body
                }
         */

//        int n = in.nextInt();
//        int i = 1;
//        while ( i <= n){
//            System.out.print("Laddu Jaan"+ "    ");             //Lily is Great Lily is Great Lily is Great Lily is Great
//            i++;
//        }

//        int k = 1;
//        while(k!=1){
//            System.out.println("Lily");                     // executed but no output
//        }



        //do while loop
        /*
            *** do while loop executes at least once unregarding the condition
            * bcz first it runs the loop then it checks the condition
        syntax :
                do{
                    //body
                   }while(condition);
         */

//        int l = 1;
//        do {
//            System.out.print("LOVE U LILY" + " ");      //LOVE U LILY LOVE U LILY LOVE U LILY LOVE U LILY LOVE U LILY
//            l++;
//        }while(l <= 5);
//
//        int l = 6;
//        do {
//            System.out.print("LOVE U LILY" + " ");          //LOVE U LILY
//            l++;
//        }while(l <= 5);


//        int i = 1;
//        do {
//            System.out.println("Lily");
//        }while( i != 1);                //Lily

//        int k = 1;
//        while(k!=1){
//            System.out.println("Lily");                     // executed but no output
//        }







    }
}