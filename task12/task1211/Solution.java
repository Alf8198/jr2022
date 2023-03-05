package com.javarush.task.task12.task1211;

/* 
Абстрактный класс Pet
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Pet() {};
        System.out.println(pet.getName());
    }


    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
    }
}

