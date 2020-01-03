package com.example.inheritance;

import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Tim",8000, LocalDate.of(1996,6,8));
        boss.setBonus(1000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Mia",5000,LocalDate.of(1997,12,8));
        staff[2] = new Employee("Ane",4500,LocalDate.of(1998,3,7));
        for (Employee e : staff)
            System.out.println("name= "+ e.getName()+", salary= "+e.getSalary());
    }
}
