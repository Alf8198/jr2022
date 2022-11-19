package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strenghtScore = Integer.compare(this.strength, anotherCat.strength);

        int totalScore = ageScore + weightScore + strenghtScore;
        return totalScore > 0;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat vaska = new Cat();
        vaska.age = 6;
        vaska.weight = 10;
        vaska.strength = 100;

        Cat murka = new Cat();
        murka.age = 12;
        murka.weight = 11;
        murka.strength = 80;

        System.out.println(murka.fight(vaska));

    }
}
