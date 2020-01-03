package com.example.abstroctTest;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("qo", 3000, LocalDate.of(1992, 2, 5));
        people[1] = new Student("aan", "CS");

        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
