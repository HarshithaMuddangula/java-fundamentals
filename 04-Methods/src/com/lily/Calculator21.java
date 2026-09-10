package com.lily;

import java.util.Scanner;

public class Calculator21 {
    static void main() {
        Scanner in = new Scanner(System.in);
        calci(in);
    }
    static void calci(Scanner in){
        double result = 0;
        while(true){
            char op = in.next().charAt(0);
            if(op == 'x' || op == 'X') return;
            else if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                float a = in.nextFloat();
                float b = in.nextFloat();
                switch (op){
                    case '+' -> result = a + b;
                    case '-' -> result = a - b;
                    case '*' -> result = a * b;
                    case '/' -> {
                        if(b != 0) {
                            result = a / b;
                        }else {
                            result = 0;
                        }
                    }
                    case '%' -> {
                        if(b != 0) {
                            result = a % b;
                        }else {
                            result = 0;
                        }
                    }
                }
                System.out.println(result);
            }
            else{
                System.out.println("invalid operator");
            }
        }
    }
}

