package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();//напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int max = 1;
        int count = 1;

        for (int i = 0; i < 9; i++) {
            if(list.get(i).equals(list.get(i+1))){
                max++;
            }else if(max > count) {
                count = max;
                max = 1;
            }else max = 1;
        }
        if (max > count){
            count = max;
        }
        System.out.println(count);
    }
}
