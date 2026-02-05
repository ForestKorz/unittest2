package org.example;
public class Main {
    public static String checkAge(int age) {
        if (age <= 18) return "ребёнок";
        else if (age >= 60) return "пенсионер";
        else return "взрослый";
    }
}