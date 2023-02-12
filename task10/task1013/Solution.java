package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        String name;
        int age;
        int weight;
        boolean sex;
        int height;
        String eyeColor;
        // Напишите тут ваши переменные и конструкторы
        public Human (String name){
            this.name = name;
        }
        public Human (String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human (int age, int weight){
            this.age = age;
            this.weight  = weight;
        }
        public Human (String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight  = weight;
        }
        public Human (int age, int weight, boolean sex){
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
        }
        public Human (String name, int age, int weight, boolean sex){
            this.name = name;
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
        }
        public Human (int age, int weight, boolean sex, int height){
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
            this.height = height;
        }
        public Human (String name, int age, int weight, boolean sex, int height){
            this.name = name;
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
            this.height = height;
        }
        public Human (int age, int weight, boolean sex, int height, String eyeColor){
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
            this.height = height;
            this.eyeColor = eyeColor;
        }
        public Human (String name, int age, int weight, boolean sex, int height, String eyeColor){
            this.name = name;
            this.age = age;
            this.weight  = weight;
            this.sex = sex;
            this.height = height;
            this.eyeColor = eyeColor;
        }
    }
}
