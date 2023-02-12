package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();//напишите тут ваш код
        list[1] = new ArrayList<>();//напишите тут ваш код
        list[2] = new ArrayList<>();//напишите тут ваш код

        list[0].add("fdhfdhsdfh11");
        list[0].add("fdhfdhsdfh12");
        list[0].add("fdhfdhsdfh13");
        list[1].add("fdhfdhsdfh21");
        list[1].add("fdhfdhsdfh22");
        list[1].add("fdhfdhsdfh23");
        list[2].add("fdhfdhsdfh31");
        list[2].add("fdhfdhsdfh32");
        list[2].add("fdhfdhsdfh33");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}