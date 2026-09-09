package com.lily;

import java.util.Arrays;

public class ChangeValue07  {
    static void main() {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] num)  {
        num[0] = 99;
    }
}
