package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = getInts();
        Arrays.sort(num);

        int maximum = num[0];
        int minimum = num[19];

        //напишите тут ваш код

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return ints;
    }//напишите тут ваш код
}
