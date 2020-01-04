package com.example.equals;

public class equalsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("edg", 3800, 1991, 2, 4);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("ig", 5600, 1993, 6, 3);
        Employee bob = new Employee("lgd", 6800, 1989, 4, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("niv", 9600, 1978, 7, 3);
        Manager boss = new Manager("hjg",15000,1978,7,9);
        boss.setBonus(1500);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
