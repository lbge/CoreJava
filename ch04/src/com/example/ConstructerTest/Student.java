package com.example.ConstructerTest;

import java.util.Random;

public class Student {
    private static int nextId;

    private int id;
    private String name = "";//初始化
    private double salary;

    //静态初始化块
    static {
        Random generator = new Random();
        //将nextId设置为0~9999的任意数
        nextId = generator.nextInt(10000);
    }

    //对象初始化块
    {
        id = nextId;
        nextId++;
    }
    //三个重载构造器

    public Student(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Student(double salary) {
        //调用Student(String, double)构造器
        this("Student" ,salary);
    }
    public Student(){
        //无参构造器，初始化赋值 name = "", salary = 0
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
