package com.example;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = in.nextLine();
        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello," + name + ". You are " + age +" years old");
    }
}
