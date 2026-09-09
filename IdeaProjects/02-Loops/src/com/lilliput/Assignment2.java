package com.lilliput;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Area Of Circle (area = π · r2)
//        float pi = 3.14F;
//        System.out.print("Enter the radius: ");
//        float r = in.nextFloat();
//        double area = pi * r * r;
//        System.out.println("Area of the circle is " + area);
        /* Enter the radius: 6.5
            Area of the circle is 132.6649932861328 */

//        // Area Of Triangle(area = (1/2) · b · h)
//        System.out.println("Enter the base and height: ");
//        float b = in.nextFloat();
//        float h = in.nextFloat();
//        double area = 0.5 * b * h;
//        System.out.println("Area of triangle is " + area);

        //Area Of Triangle(area = sqrt(s(s−a)(s−b)(s−c))); (s=a+b+c/2); s is semi perimeter
//        System.out.println("Enter the lengths of each side; ");
//        float a = in.nextFloat();
//        float b = in.nextFloat();
//        float c = in.nextFloat();
//        float s = (a + b + c) / 2;
//        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        System.out.println(s);
//        System.out.println(area);


        // Area Of Rectangle (area = l * b)
//        System.out.println("Enter width and height: ");
//        float l = in.nextFloat();
//        float b = in.nextFloat();
//        double area = l * b;
//        System.out.println("Area = " + area);

        // Area Of Isosceles Triangle (area = ½ × base × √(a² − b²/4))
        //as 1/4 is 0.25 ,java treats it as 0 ,to stop it from happening,use 1.0 or 4.0
//        System.out.println("Enter the base and length of the equal sides: " );
//        float b = in.nextFloat();
//        float a = in.nextFloat();
//        double area = (1 /4.0) * b * Math.sqrt((4 * Math.pow(a , 2)) - Math.pow(b , 2));
//        double area = .25 * b * Math.sqrt((4 * a * a) - (b * b));
//        System.out.println(area);

        // Area Of Parallelogram(area = base × height) || (Area = base × side × sin(θ)) || (Area = ½ × d₁ × d₂ × sin(θ)) || (2 * sqrt(s(s−a)(s−b)(s−c))); (s=a+b+c/2))
//        System.out.println("Enter the base and height: ");
//        float b = in.nextFloat();
//        float h = in.nextFloat();
//        double area = b * h;
//        System.out.println(area);

        // (Area = base × side × sin(θ))
//        System.out.println(" Enter the base,side length and angle: ");
//        float b = in.nextFloat();
//        float s = in.nextFloat();
//        float a = in.nextFloat();
//        double r = Math.toRadians(a);
//        double area = b * s * Math.sin(r);
//        System.out.println(area);

        // (2 * sqrt(s(s−a)(s−b)(s−d))); (s=a+b+d/2))
//        System.out.println("Enter the lengths of 2 sides and a diagonal:");
//        float a = in.nextFloat();
//        float b = in.nextFloat();
//        float d = in.nextFloat();
//        float s = (a + b + d) / 2;
//        double area =  2 * Math.sqrt(s*(s-a)*(s-b)*(s-d));
//        System.out.println(area);

        // (Area = ½ × d₁ × d₂ × sin(θ))
//        System.out.println("Enter 2 diagonal lengths and an angle: ");
//        float d1 = in.nextFloat();
//        float d2 = in.nextFloat();
//        float a = in.nextFloat();
//        double r = Math.toRadians(a);
//        double area = 1/2.0 * d1 * d2 * Math.sin(r);
//        System.out.println(area);

        // Area Of Rhombus(area = (1/2) · p · q)
//        System.out.println("Enter the length of 2 diagonals: ");
//        float p = in.nextFloat();
//        float q = in.nextFloat();
//        double area = 1/2.0 * p * q;
//        System.out.println(area);

        // Area Of Equilateral Triangle (Area = (√3/4) × s²) writen as (area = (1/4) · sqrt(3) · s2)
//        System.out.println("enter the side length: ");
//        float a = in.nextFloat();
//        double area = 1/4.0 * Math.sqrt(3) * a * a ;
//        System.out.println(area);

        // Circumference Of Circle (Circumference = 2𝜋𝑟) {perimeter}
//        System.out.println("enter the radius: ");
//        float pi = 3.14F;
//        float r = in.nextFloat();
//        double c = 2 * pi * r;
//        double c = 2 * Math.PI * r;
//        System.out.println(c);

        // Perimeter Of Equilateral Triangle(perimeter = 3 · s)
//        System.out.println("Enter the length of side: ");
//        float a = in.nextFloat();
//        double perimeter = 3 * s;
//        System.out.println(perimeter);

        // Perimeter Of Parallelogram(perimeter = 2 · (a + b))
//        System.out.println("Enter the base and side length:");
//        float a = in.nextFloat();
//        float b = in.nextFloat();
//        double perimeter = 2 * ( a + b );
//        System.out.println(perimeter);

        // Perimeter Of Rectangle(perimeter = 2 (l + b))
//        System.out.println("Enter the length and breadth: ");
//        float l = in.nextFloat();
//        float b = in.nextFloat();
//        double perimeter = 2 * ( l + b );
//        System.out.println(perimeter);

        // Perimeter Of Square(perimeter = 4 · s)
//        System.out.println("Enter the length of side: ");
//        float s = in.nextFloat();
//        double perimeter = 4 * s;
//        System.out.println(perimeter);

        // Perimeter Of Rhombus(perimeter = 4 · s)
//        System.out.println("Enter the length of side: ");
//        float s = in.nextFloat();
//        double perimeter = 4 * s;
//        System.out.println(perimeter);

        // Volume Of Cone (volume = (1/3) · π · r2 · h)
//        System.out.println("Enter the radius and height: ");
//        float r = in.nextFloat();
//        float h = in.nextFloat();
//        double volume = 1/3.0 * Math.PI * Math.pow(r,2) * h;
//        System.out.println(volume);

        // Volume Of Prism(Volume = Base Area × Height)
        /* base area of square = s * s
           base area of rectangle = l * b
           base area of triangle = 1/2 * b * h */

        // Volume of a square prism (s * s * h )
//        System.out.println("Enter the side length and height: ");
//        float s = in.nextFloat();
//        float h = in.nextFloat();
//        double volume = s * s * h;
//        System.out.println(volume);

        // Volume of a rectangular prism (l * b * h )
//        System.out.println("Enter the length , breadth and height: ");
//        float l = in.nextFloat();
//        float b = in.nextFloat();
//        float h = in.nextFloat();
//        double volume = l * b * h;
//        System.out.println(volume);

        // Volume of a triangular prism (1/2 * l * b * h )
//        System.out.println("Enter the length , base and height: ");
//        float l = in.nextFloat();
//        float b = in.nextFloat();
//        float h = in.nextFloat();
//        double volume = 1/2.0 * l * b * h;
//        System.out.println(volume);

//        // Volume Of Cylinder(volume = π · r2 · h)
//        System.out.println("Enter the radius and height: ");
//        float r = in.nextFloat();
//        float h = in.nextFloat();
//        double volume = Math.PI * Math.pow(r,2) * h;
//        System.out.println(volume);

        // Volume Of Sphere(volume = (4/3) · π · r3)
//        System.out.println("Enter the radius: ");
//        float r = in.nextFloat();
//        double volume = 4/3.0 * Math.PI * r * r * r;
//        System.out.println(volume);

         // Volume Of Pyramid(volume = (1/12) · h · n ·s2 · cot(π/n)) or (volume = 1/3 * base area * h)
//        System.out.println("Enter height,number of sides,edge length: ");
//        float h = in.nextFloat();
//        int n  = in.nextInt();
//        float s = in.nextFloat();
//        double volume = 1/12.0 * h * n * s * s * 1/Math.tan(Math.PI/n);
//        System.out.println(volume);

        //Curved Surface Area Of Cylinder(CSA = 2πrh)
//        System.out.println("Enter the radius and height: ");
//        float r = in.nextFloat();
//        float h = in.nextFloat();
//        double CSA = 2 * Math.PI * r * h;
//        System.out.println(CSA);

        // Total Surface Area Of Cube(6a²)
//        System.out.println("Enter the edge length: ");
//        float a = in.nextFloat();
//        double TSA = 6 * a * a;
//        System.out.println(TSA);

        // Fibonacci Series
//        System.out.println("Enter n: ");
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int i = 1;
//        while (i <= n ){
//            System.out.println(a);
//            int temp = a + b ;
//            a = b;
//            b = temp;
//            i++;
//        }

        // Subtract the Product and Sum of Digits of an Integer
//        int num = in.nextInt();
//        int original = num;
//        double sum = 0;
//        double result = 0;
//        while (num > 0){
//           int rem = num % 10;
//           sum = sum + rem;
//           num = num / 10;
//        }
//        num = original;
//        double product = 1;
//        while (num > 0){
//            int rem = num % 10;
//            product = product * rem;
//            num = num / 10;
//        }
//        result = product - sum;
//        System.out.println(result);


        // Input a number and print all the factors of that number (use loops)
//        int num = in.nextInt();
//        for (int i = 1; i <= num; i++) {
//            if(num % i == 0){
//                System.out.print(i+" ");
//            }
//        }

        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//        int sum = 0;
//        while (true) {
//            int n = in.nextInt();
//            if (n == 0) {
//                break;
//            } else {
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);

        // Take integer inputs till the user enters 0 and print the largest number from all.
//        int max = 0;
//        while(true){
//            int n = in.nextInt();
//            if(n == 0){
//                break;
//            } else if(n > max){
//                max = n;
//            }
//        }
//        System.out.println(max);

         // Addition Of Two Numbers
//        System.out.println("input first number: ");
//        float a = in.nextFloat();
//        System.out.println("input second number: ");
//        float b = in.nextFloat();
//        double sum = a + b;
//        System.out.println(sum);

    }
}





