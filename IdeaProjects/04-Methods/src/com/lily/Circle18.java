package com.lily;

import java.util.Scanner;

public class Circle18 {
    static void main() {
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        System.out.println(area(r));
        System.out.println(circumference(r));
    }
    static double area(float r) {
        return  Math.PI * r * r;
    }
    static double circumference(float r) {
        return  2 * Math.PI * r;
    }
}
