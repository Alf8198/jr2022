package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            String s = scanner.nextLine();
            if (s.equals("сумма")){
                break;
            }sum = sum + Integer.parseInt(s);
        }

        System.out.println(sum);
        //напишите тут ваш код
    }
}
