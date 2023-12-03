package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;

/* 
Файл в статическом блоке
*/
/*
Файл в статическом блоке
Для решения этой задачи:
1.Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2.В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Requirements:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
 */

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
//        for (String line: lines) {
//            System.out.println(line);
//        }
        System.out.println(lines);
    }
    static {
        try {
            File myFile = new File(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null){
                lines.add(line);
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
