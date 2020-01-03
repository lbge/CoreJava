package com.example;

import java.time.LocalDate;

public class SalaryTest {
    public static void main(String[] args) {

        Student[] stu = new Student[3];

        stu[0] = new Student("qq", 20, 1995, 7, 15, 3000);
        stu[1] = new Student("ww", 21, 1996, 6, 15, 3500);
        stu[2] = new Student("ee", 22, 1994, 3, 12, 3300);
        for (Student s : stu)
            s.raiseSalary(15);

        for (Student s : stu)
            System.out.println("Name is: " + s.getName() + ", Age is: " + s.getAge()+ ", Birthday is: "+ s.getBirthday()
            + ", Salary is: " + s.getSalary());
    }

    static class Student {
        private String name;
        private int age;
        private LocalDate birthday;
        private double salary;

        public Student(String name, int age, int year, int month, int day, double salary) {
            this.name = name;
            this.age = age;
            this.birthday = LocalDate.of(year, month, day);
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public double getSalary() {
            return salary;
        }

        public void raiseSalary(double percent) {
            double raise = salary * percent / 100;
            salary += raise;
        }
    }
}
