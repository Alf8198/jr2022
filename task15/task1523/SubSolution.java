package com.javarush.task.task15.task1523;

public class SubSolution extends Solution{
    public SubSolution(int i) {
        super(i);
        System.out.println("инициализация конструктора SubSolution");
    }

    protected SubSolution(double i) {
        super(i);
        System.out.println("инициализация конструктора SubSolution");
    }

    SubSolution() {
        System.out.println("инициализация конструктора SubSolution");
    }
}
