package com.harshitha;

import java.util.Scanner;

public class NestedSwitch02 {
    static void main() {
        Scanner in = new Scanner(System.in);
//        String dept = in.next();
//        switch(dept){
//            case "IT" :
//                System.out.println("Not our dept");
//                break;
//            case "DS":{
//                int id = in.nextInt();
//                switch(id){
//                    case 1 :
//                        System.out.println("Harshitha");
//                        break;
//                    case 2 :
//                        System.out.println("Lily");
//                        break;
//                }
//                break;
//            }
//
//        }

        String dept = in.next();
        switch (dept) {
            case "IT" -> System.out.println("Not our dept");
            case "DS" -> {
                int id = in.nextInt();
                switch (id) {
                    case 1 -> System.out.println("Harshitha");
                    case 2 -> System.out.println("Lily");
                }
            }
        }

        




    }
}
