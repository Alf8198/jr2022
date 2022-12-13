package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // цикл для запонения списка
            strings.add(bufferedReader.readLine());
        }

        int min = strings.get(0).length(); // за минимальное значение берем первую строку изз 0 ячейки
        for (int i = 1; i < strings.size(); i++) { // цикл с 1 ячейки а не с 0
            if (strings.get(i).length() > min){ // сравнение длины строк минимальной строкой
                min = strings.get(i).length(); // присваиваем занчение мин след строке если условие выполнено
            } else{
                System.out.println(i); // если не выполнено выводим на экран номер элемента
                break; // останавливаем цикл
            }
        }
    }
}

