package com.lily;

import java.util.Scanner;

public class Eligibility15 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean ans = voter(age);
        System.out.println(ans);
    }
        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
static boolean voter(int age){
    return age >= 18;
}
}
