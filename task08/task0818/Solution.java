package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Петров",500);
        map.put("Андропов",700);
        map.put("Смирнов",900);
        map.put("Пупкин",100);
        map.put("Булкин",300);
        map.put("Кошкин",450);
        map.put("Бочкин",770);
        map.put("Печкин",1012);
        map.put("Иванов",0);
        map.put("Какашкин",17);
        removeItemFromMap(map);
        return map;//напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair: copyMap.entrySet()) {
            if (pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(createMap());
    }
}