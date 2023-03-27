package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // поток ввода с клавиатуры
            String sourceFileName = reader.readLine(); // ввод пути к файлу
            FileInputStream fileInputStream = new FileInputStream(sourceFileName); // поток чтения из файла

            Scanner scanner = new Scanner(fileInputStream); // чтение содержимого файла
            StringBuilder builder = new StringBuilder(); // добавляем все сюда из прочитанного файла

            while (scanner.hasNextLine()) { // цикл пока есть следующая строка
                builder.append(scanner.nextLine()).append("\n");//builder.append(scanner.nextLine()).append("\n"); добавляет каждую прочитанную строку файла в StringBuilder, а метод scanner.nextLine() читает следующую строку из файла.
            }
            System.out.print(builder.toString()); // вывод содержимого StringBuilder в консоль

            scanner.close(); // закрываем сканнер
            reader.close(); // закрываем поток чтения
            // напишите тут ваш код
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}