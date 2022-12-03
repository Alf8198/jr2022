package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());
        int thirdNum = Integer.parseInt(reader.readLine());
        int fourthNum = Integer.parseInt(reader.readLine());
        int fifthNum = Integer.parseInt(reader.readLine());

        int minimum = min(firstNum, secondNum, thirdNum, fourthNum, fifthNum);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum) {
        return Math.min(Math.min(Math.min(firstNum,secondNum),Math.min(thirdNum,fourthNum)),fifthNum);
    }

    /*public static int min(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum) {
        return min(min(min(firstNum,secondNum), min(thirdNum,fourthNum)), fifthNum);
    }*/


    /*public static int min(int firstNum, int secondNum) {
        return firstNum < secondNum ? firstNum : secondNum;
    }*/
}
