package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A; //Поле A должно быть публичным и статическим.
    public static int B; //	Поле B должно быть публичным и статическим.

    static { //В статическом блоке считать с консоли А и В — две переменные с типом int.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Программа должна считывать данные с клавиатуры в статическом блоке.
        try{ //Обработать IOException в блоке catch.
            A = Integer.parseInt(reader.readLine()); //Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
            B = Integer.parseInt(reader.readLine()); //Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
            reader.close(); //Закрыть поток ввода методом close().
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) { //	Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
