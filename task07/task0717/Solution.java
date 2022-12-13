package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));// Считать строки с консоли и объявить ArrayList list тут
        
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i));
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleStrings = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            doubleStrings.add(list.get(i));
            doubleStrings.add(list.get(i));
        }//напишите тут ваш код
        return doubleStrings;
    }
}
