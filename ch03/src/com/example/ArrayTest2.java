package com.example;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int y = in.nextInt();
        int[][] arr = new int[y][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[2*i + 1];
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int[] row : arr) {
            for (int e : row) {
                System.out.print(e);
            }
            System.out.println();
        }

    }
}
