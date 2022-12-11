package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код

        int[] intsAll = new int[15]; // массив на 15 ячеек
        int countOdd = 0; // нечетная сторона
        int countEven = 0; // четная сторона

        for (int i = 0; i < intsAll.length; i++) {
            intsAll[i] = Integer.parseInt(bufferedReader.readLine()); // ввод в консоль
            if (i % 2 == 0){  // деление с остатком
                countEven += intsAll[i]; // сумирую числа на четной стороне
            } else {
                countOdd += intsAll[i]; // сумирую числа на нечетной стороне
            }
        }
        // тернарный оператор сравнения и сразу вывод в консоль
        System.out.println((countEven > countOdd) ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");
        System.out.println(countEven +" "+ countOdd); // так читсо для себя вывел на печать
    }
}
