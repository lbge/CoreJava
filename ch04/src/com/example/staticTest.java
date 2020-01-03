package com.example;

public class staticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("QQQ", 30000);
        staff[1] = new Employee("WWW", 20000);
        staff[2] = new Employee("EEE", 40000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("Name = " + e.getName() + ", id = "+e.getId()+", Salary = " + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println(n);
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}

