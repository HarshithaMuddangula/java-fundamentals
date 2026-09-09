package com.lilliput;

import java.util.Scanner;

public class Calculator08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().charAt(0);
            if ((op == '+') || (op == '-') || (op == '*') || (op == '/') || (op == '%')) {
                System.out.print("Enter 2 numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    result = a + b;
                }
                if (op == '-') {
                    result = a - b;
                }
                if (op == '*') {
                    result = a * b;
                }
                if (op == '/') {
                    result = a / b;
                }
                if (op == '%') {
                    result = a % b;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println(result);
        }

    }
}