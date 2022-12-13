package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integersToThree = new ArrayList<>();
        ArrayList<Integer> integersToTwo = new ArrayList<>();
        ArrayList<Integer> integersToOther = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 3 == 0){
                integersToThree.add(integers.get(i));
                if (integers.get(i) % 2 == 0){
                    integersToTwo.add(integers.get(i));
                }
            } else if (integers.get(i) % 2 == 0) {
                integersToTwo.add(integers.get(i));
            } else {
                integersToOther.add(integers.get(i));
            }
        }
        printList(integersToThree);
        printList(integersToTwo);
        printList(integersToOther);//напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");//напишите тут ваш код
    }
}
