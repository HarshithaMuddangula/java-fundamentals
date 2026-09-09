package com.lily;

import java.util.Scanner;

public class Grades19 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String ans = grade(marks);
        System.out.println(ans);

    }
    /* Write a program that will ask the user to enter his/her marks (out of 100).
    Define a method that will display grades according to the marks entered as below:

    Marks        Grade
    91-100         AA
    81-90          AB
    71-80          BB
    61-70          BC
    51-60          CD
    41-50          DD
    <=40          Fail              */

    static String grade(int marks){
        if(marks > 100 || marks < 0 ) return"Invalid";
      if(marks >= 91 ) return"AA";
      if(marks >= 81 ) return"AB";
      if(marks >= 71 ) return"BB";
      if(marks >= 61 ) return"BC";
      if(marks >= 51 ) return"CD";
      if(marks >= 41 ) return"DD";
      return"Fail";
    }

}