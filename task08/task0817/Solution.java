package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();//напишите тут ваш код
        map.put("Петров","Вася");
        map.put("Андропов","Антон");
        map.put("Смирнов","Димон");
        map.put("Пупкин","Вадим");
        map.put("Булкин","Вася");
        map.put("Кошкин","Саня");
        map.put("Бочкин","Константин");
        map.put("Печкин","Почтальон");
        map.put("Иванов","Иван");
        map.put("Какашкин","Саня");

        removeTheFirstNameDuplicates(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copyMap = new HashMap<>(map);
        for (String name: copyMap.values()) {
            int count = 0;
            for (String nameMap: map.values()) {
                if (nameMap.equals(name)){
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }//напишите тут ваш код
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(createMap());

    }
}
