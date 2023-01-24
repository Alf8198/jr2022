package com.javarush.task.task09.task0921;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        List<Integer> list = new ArrayList<>();

        try{
            String s;
            while (true){
                s = bufferedReader.readLine();
                list.add(Integer.parseInt(s));
            }
        }catch (Exception exception){
            for (int i = 0; i < list.size() ; i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
