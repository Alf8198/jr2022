package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // открываем поток
        int[] ints = new int[10];//создал массив на 10 ячеек

        for (int i = 0; i < ints.length; i++) { // цикл на заполнения массива с консоли
            ints[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = ints.length - 1; i >= 0; i--) { // цикл на обратный вывод массива в консоль
            System.out.println(ints[i]);
        }
    }
}

