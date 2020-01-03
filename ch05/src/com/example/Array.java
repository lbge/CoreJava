package com.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = {1,33,34,234,2,4,2342,3,4,242,34,2,4242};

        String s = Arrays.toString(a);
        System.out.println(s);
        int i = Arrays.hashCode(a);

        int i1 = Arrays.hashCode(a);
        System.out.println(i);
        System.out.println(i1);
    }
}
