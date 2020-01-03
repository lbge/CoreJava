package com.example;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {1,2,1,7,6,8};
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOf(a,10);
        for (int n : b)
            System.out.print(n);
    }
}
