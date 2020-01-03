package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
        int num = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int max = in.nextInt();
        int[] array = new int[max];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int[] result = new int[num];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * max);//random 包含0，不包含1，永远取不到max
            result[i] = array[r];
            //用最后一个元素替换掉原数组被抽走的元素
            array[r] = array[max - 1];
            max--;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        /*for (int e: result)
            System.out.println(e);*/
    }
}
