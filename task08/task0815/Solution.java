package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Петров","Алеша");//напишите тут ваш код
        map.put("Кукушкин","Петух");//напишите тут ваш код
        map.put("Сидоров","Семушка");//напишите тут ваш код
        map.put("Хуйлушкин","Хер");//напишите тут ваш код
        map.put("Потаскушкин","Тюля");//напишите тут ваш код
        map.put("Ушлепкин","Тюля");//напишите тут ваш код
        map.put("Мандавошкин","Патаскун");//напишите тут ваш код
        map.put("Илонмасков","Илон");//напишите тут ваш код
        map.put("Подросткин","Сосунок");//напишите тут ваш код
        map.put("Кеноби","Оби");//напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count  = 0;
        for (String s: map.values()) {
            if (s.equals(name)){
                count++;
            }
        }//напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count  = 0;
        for (String s: map.keySet()) {
            if (s.equals(lastName)){
                count++;
            }
        }//напишите тут ваш код
        return count;//напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(),"Тюля"));
        System.out.println(getCountTheSameLastName(createMap(),"Кеноби"));
    }
}
