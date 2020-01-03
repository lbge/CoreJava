package com.example.ConstructerTest;

public class ConstructorTest {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        stu[0] = new Student("QWE",4000);
        stu[1] = new Student(3304);
        stu[2] = new Student();

        for (Student s:stu)
            System.out.println("name=" + s.getName() + ",id=" + s.getId() + ",salary="
                    + s.getSalary());
    }
}
