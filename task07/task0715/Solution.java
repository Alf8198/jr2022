package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");//напишите тут ваш код
        list.add("мыла");//напишите тут ваш код
        list.add("раму");
        String s = "именно";//напишите тут ваш код

        for (int i = 0; i < list.size(); i+=2) {
            list.add(i+1, s);
        }
        for (String i: list) {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
