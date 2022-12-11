package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] ints = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {
            strings[i] = bufferedReader.readLine(); // заполняем массив строками
            ints[i] = strings[i].length(); // заполняем масси в чисел длинной строки выше
            System.out.println("Длинна ячейки " + (i + 1) +" равна: " + ints[i]); // выводим длину строки выше
        }
        //напишите тут ваш код
    }
}
