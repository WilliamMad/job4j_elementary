package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, my name is " + name + ". I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
