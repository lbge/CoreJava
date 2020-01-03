package com.example;

import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m;
        if (n > 8) {
            m = 50;
        } else if (n > 5) {
            m = 30;
        }else if (n>3){
            m = 10;
        } else {
            m = 0;
        }
        System.out.println(m);
    }
}
