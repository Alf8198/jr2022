package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);//ввод в консоль
        String month = scanner.nextLine(); //ввод

        List<String> months = new ArrayList<>(); // создание списка
        months.add("January"); // заполнение
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        /*int num = 0; // переменная для индекса месяца
        for (String s : months) { // проход по списку
                if (s.equalsIgnoreCase(month)) { // сравниваем игнорирую регистр
                    num = months.indexOf(s) + 1; // если есть соовпадение, то записываем номер ячейки в переменную
                }
            }
        if (num > 0){  // если переменная больше нуля
            System.out.println(month + " is the " + num + " month"); // вывод фразы
        }else { // иначе
            System.out.println(month + " isn't a month"); // выод фразу
        }*/

        if (months.contains(month)) { // проход по списку, проверка содержит ли список данную строку
            int num = months.indexOf(month) + 1; // если да, то прибаляем к индексу 1
            System.out.println(month + " is the " + num + " month"); // выводим на экран
        } else {
            System.out.println(month + " isn't a month"); // если нет, то выводим другое на экран
        }
        }
    }

