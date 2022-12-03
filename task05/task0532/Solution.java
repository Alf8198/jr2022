package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        ArrayList<Integer> list  = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        if (n > 0){
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            maximum = Collections.max(list);
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
