package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            Scanner scanner = new Scanner(new FileInputStream(fileName));

            ArrayList<Integer> list = new ArrayList<>();

            while (scanner.hasNext()){
                int i = scanner.nextInt();
                if(i % 2 == 0){
                    list.add(i);
                }
            }
            Collections.sort(list);
            for (Integer num: list) {
                System.out.println(num);
            }
            reader.close();
            scanner.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
