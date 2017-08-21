package com.knoldus.services;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object obj) {
        return this.marks == ((Student) obj).marks;
    }

    @Override
    public String toString() {
        return "name : " + name + ",marks : " + marks;
    }
}
