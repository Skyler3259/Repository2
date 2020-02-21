package com.company;

class Student {

    String name;
    String major;
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Skyler Williams";
        student.major = "Computer";
        System.out.println("My name is " + student.name + ", I want to be a " + student.major + ".");
        
    }
}
