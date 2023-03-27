package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try{ // проверка на искключение
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // поток записи из консоли
            String fileName = reader.readLine(); // ввод названия файла из консоли
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)); // создали поток записи в файл

            while (true){ //делать пока верно
                String line = reader.readLine(); // ввод строк из консоли
                if (line.equals("exit")){ // условие если введеная строка равна "exit"
                    writer.write(line); // записываем строку в файл
                    writer.close(); // закрываем поток записи в файл
                    return; // выходим из условия
                }
                writer.write(line); // если условие не подхоит под сравнение записываем строку в файл
                writer.newLine(); // перевод на новую строку в файле
            }
        }catch (IOException e){ // отлавливаем ошибку
            e.printStackTrace(); // выводим стек ошибки
        }
    }
}
