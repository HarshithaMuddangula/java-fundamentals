package com.lilliput;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Factorial Program #
//        long F = 1;
//        int n = in.nextInt();
//        while(n >= 2){
//             F = F * n;
//            n--;
//        }
//        System.out.println(F);          //5-120

        // Calculate Electricity Bill #
//        int units = in.nextInt();
//        double bill = 0;
//        if(units <= 100){
//            bill = units * 3;
//        } else if( units <= 200){
//            bill = (100 * 3) + ((units - 100) * 4.50);
//        }else{
//            bill = (100 * 3) + (100 * 4.50) + ((units - 200) * 6);
//        }
//        bill = bill + 50;
//        System.out.println(bill);

        // Calculate Average Of N Numbers #
//        System.out.println("Enter the total number of values:");
//        int n = in.nextInt();
//        int i = 1;
//        double sum = 0;
//        while(i <= n){
//            System.out.print("Enter the " + i +  " value:");
//            int m = in.nextInt();
//            sum = sum + m;
//            i++;
//        }
//        double avg = sum / n;
//        System.out.println(avg);

        // Calculate Discount Of Product #
       /* saving = (original * discount) / 100
        finalprice = original - saving */
//        System.out.println("Enter Original cost:");
//        int original = in.nextInt();
//        System.out.println("Enter the discount%:");
//        int discount = in.nextInt();
//        int saving = (original * discount) / 100;
//        int finalprice = original - saving;
//        System.out.println(finalprice);

        // Calculate Distance Between Two Points #
        // d = sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
//        System.out.println("Input x1 y1 x2 y2");
//        float x1 = in.nextFloat();
//        float y1 = in.nextFloat();
//        float x2= in.nextFloat();
//        float y2 = in.nextFloat();
//        double x = x2 - x1;
//        double y = y2 - y1;
//        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
//        System.out.println(distance);

        // Calculate Commission Percentage #
        // {Commission Percentage} = {Commission Earned} /{Total Sales Amount} * 100
//        System.out.println("Enter the total sales amount and Commission earned:");
//        double tsa = in.nextDouble();
//        int ce = in.nextInt();
//        double cp = (ce / tsa) * 100;
//        System.out.println(cp+ "%");

        // Power In Java #
//       float n = in.nextFloat();
//        int p = in.nextInt();
//        double ans = 1;
//            while (p > 0) {
//                ans = ans * n;
//                p--;
//        }
//            while ( p < 0){
//                ans = ans / n;
//                p++;
//            }
//        System.out.println(ans);

        // Calculate Depreciation of Value #
        // Annual Depreciation = (Initial Cost - Salvage Value ) / Useful Life
//        System.out.println("enter ic,sv,ul:");
//        double ic = in.nextDouble();
//        double sv = in.nextDouble();
//        int ul = in.nextInt();
//        double da = ic - sv;
//        double dov = da / ul;
//        System.out.println(dov);

        // Calculate Batting Average #
        // {Batting Average} = {Total Runs Scored}/{Total Times Dismissed (Out)}
//        double totalruns = in.nextDouble();
//        int matches = in.nextInt();
//        int notouts = in.nextInt();
//        int outs = matches - notouts;
//        double avg = 1;
//        if ( outs == 0){
//            avg = totalruns;
//        } else {
//            avg =  totalruns / outs;
//        }
//        System.out.println(avg);

       // Calculate CGPA #
        // {CGPA} = {Sum of Grade Points}/{Total Number of Subjects}
//        System.out.println("Input no. of subjects:");
//        int n = in.nextInt();
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter grade points of subject " +i+":");
//            double points = in.nextDouble();
//            sum = sum + points;
//        }
//        double cgpa = sum / n;
//        System.out.println(cgpa);

        // Compound Interest
      //  A = P (1 + (r/n))^{nt}
//        int P = in.nextInt();
//       double r = in.nextDouble();
//       r = r / 100;
//        int n = in.nextInt();
//        int t = in.nextInt();
//        double A = P * Math.pow((1 + (r / n )),n * t );
//        System.out.println(A);

        // Calculate Average Marks
        // Average Marks = Sum of All Marks / Total Number of Subjects
//        System.out.println("Enter total no. of subjects:");
//        int n = in.nextInt();
//        double sum = 0;
//        System.out.println("Enter marks:");
//        for (int i = 1; i <= n ; i++) {
//            int m = in.nextInt();
//            sum = sum + m;
//        }
//        double avg = sum / n;
//        System.out.println(avg);

        // Sum Of N Numbers
//        System.out.println("Enter total no. of values:");
//        int n = in.nextInt();
//        double sum = 0;
//        System.out.println("Enter numbers:");
//        for (int i = 1; i <= n ; i++) {
//            int m = in.nextInt();
//            sum = sum + m;
//        }
//        System.out.println(sum);

        // Armstrong Number
//        int n = in.nextInt();
//        int original = n;
//        int digits = 0;
//        while(n > 0){
//            n = n/10;
//            digits++;
//        }
//        int sum = 0;
//        n = original;
//        while(n > 0){
//            int rem = n % 10;
//            int power = 1;
//            for (int i = 0; i < digits; i++) {
//                power = power * rem;
//            }
//            n = n / 10;
//            sum = sum + power;
//        }
//        if (original == sum){
//            System.out.println("Armstrong number");
//        }else{
//            System.out.println("not an armstrong number");
//        }

        // Find Ncr & Npr
       // nPr = n! / (n-r)! && nCr = n! / (r! * (n-r)!)
//        System.out.println("Enter the total number of items:");
//        int n = in.nextInt();
//        System.out.println("Enter the number of items chose:");
//        int r = in.nextInt();
//        int m = n-r;
//        long nf = 1;
//        long rf = 1;
//        long mf = 1;
//        while(n >= 2){
//            nf = nf * n;
//            n--;
//        }
//        while(m >= 2){
//            mf = mf * m;
//            m--;
//        }
//        while( r >= 2){
//             rf = rf * r;
//             r--;
//        }
//        double npr = (double)nf / mf;
//        double ncr  = (double)nf / (rf * mf);
//        System.out.println(npr);
//        System.out.println(ncr);

       // Reverse A String In Java
//        System.out.println("Enter a String:");
//        String A = in.next();
//        String rev ="";
//        int i = A.length() - 1;
//        while(i >= 0) {
//            rev = rev + A.charAt(i);
//            i--;
//        }
//        System.out.println(rev);

        // Find if a number is palindrome or not
//        System.out.println("Enter a number:");
//        int n = in.nextInt();
//        int o = n;
//        int rev = 0;
//        while(n > 0){
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n /= 10;
//        }
//        if( o == rev){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("no");
//        }

        // HCF Of Two Numbers
//        System.out.println("Input 2 numbers:")
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int h = a;            // h = min
//        if(b < h){
//            h = b;
//        }
//        while (a % h != 0 || b % h != 0){
//            h -= 1;
//        }
//        System.out.println(h);


        // LCM Of Two Numbers
//        System.out.println("Input 2 numbers:");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int l = a;            // l = max
//        if(b > l){
//            l = b;
//        }
//        while (l % a != 0 || l % b != 0){
//            l += 1;
//        }
//        System.out.println(l);

        // Vowel Or Consonant
//        System.out.println();
//        char ch = in.next().trim().charAt(0);    // u can use Character.toLowercase()
//        if(ch >= 'a' && ch<= 'z' || ch >= 'A' && ch<= 'Z'){
//           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//               System.out.println("Vowel");
//           }else{
//               System.out.println("consonant");
//           }
//        }else{
//            System.out.println("Invalid Input");
//        }


        // Perfect Number
        // sum of its divisors = itself
//        System.out.println("Input a number: ");
//        int n = in.nextInt();
//        int sum = 0;
//        for(int i = 1;i < n;i++){
//            if(n % i == 0){
//                sum += i;
//            }
//        }
//        if(sum == n){
//            System.out.println("Perfect Number");
//        }else{
//            System.out.println("Not a perfect number");
//        }

        //  Check Leap Year Or Not
//        System.out.println("Enter the year:");
//        int y = in.nextInt();
//        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
//            System.out.println("Leap Year");
//        }else{
//            System.out.println("Non Leap Year");
//        }

        // Sum Of A Digits Of Number
//        System.out.println("Enter the number:");
//        int n = in.nextInt();
//        int sum = 0;
//        while( n > 0){
//            int rem = n % 10;
//            sum += rem;
//            n = n/10;
//        }
//        System.out.println(sum);

        /* Kunal is allowed to go out with his friends only on the even days of a given month.
         Write a program to count the number of days he can go out in the month of August.*/
//        int i = 2;
//        int allowed = 0;
//        while(i <= 31){
//            if(i % 2 == 0){
//                allowed++;
//            }
//            i += 2;
//        }
//        System.out.println(allowed);

//        int totaldays = 31;
//        int allowed = totaldays/2;
//        System.out.println(allowed);

        /* Write a program to print the sum of negative numbers,
        sum of positive even numbers and
         the sum of positive odd numbers from a list of numbers (N) entered by the user.
         The list terminates when the user enters a zero. */
//        int sumnegative = 0;
//        int sumpositiveeven = 0;
//        int sumpositiveodd = 0;
//        while(true){
//            int n = in.nextInt();
//            if(n == 0){
//                break;
//            }else{
//                if (n < 0) {
//                    sumnegative += n;
//                }
//                if (n > 0 && n % 2 == 0) {
//                    sumpositiveeven += n;
//                }
//                if (n > 0 && n % 2 != 0) {
//                    sumpositiveodd += n;
//                }
//            }
//        }
//        System.out.println("Sum of negative numbers is "+sumnegative);
//        System.out.println("Sum of positive even numbers is "+sumpositiveeven);
//        System.out.println("Sum of positive odd numbers is "+sumpositiveodd);
    }
}
