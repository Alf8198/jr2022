package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultCat = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            resultCat.add(new Cat());
        }//напишите тут ваш код
        return resultCat;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultDog = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            resultDog.add(new Dog());
        }//напишите тут ваш код
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);//напишите тут ваш код
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet: pets) {
            System.out.println(pet);
        }//напишите тут ваш код
    }

    public static class Cat{}
    public static class Dog{}//напишите тут ваш код
}
