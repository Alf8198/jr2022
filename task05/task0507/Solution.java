package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = 0;
        while (true){
            int console = Integer.parseInt(bufferedReader.readLine());

            if (console != -1) {
                sum = sum + console;
                count++;
            }else {
                break;
            }

        }
        double total = (double)sum / (double)count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(total);

        //напишите тут ваш код
    }
}

