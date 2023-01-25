package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("name" + i, new Cat("name" + i));
        }
        /*map.put("q", new Cat("q"));//напишите тут ваш код
        map.put("w", new Cat("w"));//напишите тут ваш код
        map.put("e", new Cat("e"));//напишите тут ваш код
        map.put("r", new Cat("r"));//напишите тут ваш код
        map.put("t", new Cat("t"));//напишите тут ваш код
        map.put("y", new Cat("y"));//напишите тут ваш код
        map.put("u", new Cat("u"));//напишите тут ваш код
        map.put("i", new Cat("i"));//напишите тут ваш код
        map.put("o", new Cat("o"));//напишите тут ваш код
        map.put("p", new Cat("p"));//напишите тут ваш код*/

        Map<String, Cat> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {


        return new HashSet<>(map.values());//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
