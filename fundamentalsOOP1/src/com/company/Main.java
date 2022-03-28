package com.company;

public class Main {

    static class Student {
        String name;
        int age;
        int id;

    }
    public static void main(String[] args) {

        Student a = new Student ();
        a.age = 30;
        a.id = 12345678;
        a.name = "Joro";
        System.out.println("age: " + a.age);
        System.out.println ("ID: " + a.id);
        System.out.println ("name: " + a.name);

        System.out.println (" ");
        Student b = new Student ();
        b.age = 25;
        b.id = 10101010;
        b.name = "Pesho";
        System.out.println ("age: " + b.age);
        System.out.println ("ID: " + b.id);
        System.out.println ("name: " + b.name);

        // write your code here
    }
}
