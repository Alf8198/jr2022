package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");//напишите тут ваш код
        set.add("банан");//напишите тут ваш код
        set.add("вишня");//напишите тут ваш код
        set.add("груша");//напишите тут ваш код
        set.add("дыня");//напишите тут ваш код
        set.add("ежевика");//напишите тут ваш код
        set.add("женьшень");//напишите тут ваш код
        set.add("земляника");//напишите тут ваш код
        set.add("ирис");//напишите тут ваш код
        set.add("картофель");//напишите тут ваш код

        for (String s: set) {
            System.out.println(s);
        };//напишите тут ваш код
    }
}
