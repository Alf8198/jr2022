package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] intsBig = new int[20];//напишите тут ваш код
        int[] intsLit1 = new int[10];
        int[] intsLit2 = new int[10];

        for (int i = 0; i < intsBig.length; i++) { // заполнение большого массива
            intsBig[i] = Integer.parseInt(bufferedReader.readLine());
        }
        /*for (int i = 0; i < 10; i++) {    //копирование через цикл
            intsLit1[i] = intsBig[i];
            intsLit2[i] = intsBig[i + 10];
        }*/

        intsLit1 = Arrays.copyOf(intsBig,10); //копирование через Arrays до 10 ячейки
        intsLit2 = Arrays.copyOfRange(intsBig,10,20); //копирование через Arrays с 10 до 20 ячейки

        for (int i = 0; i < intsLit2.length; i++) { // вывод 2 маленького массива в консоль
            System.out.println(intsLit2[i]);
        }

    }
}
