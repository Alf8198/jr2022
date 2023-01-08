package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();//напишите тут ваш код
        people.put("f","fa");//напишите тут ваш код
        people.put("f","aa");
        people.put("a","fa");
        people.put("d","da");
        people.put("v","va");
        people.put("b","ba");
        people.put("n","na");
        people.put("m","ma");
        people.put("r","ra");
        people.put("r","fr");
        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
