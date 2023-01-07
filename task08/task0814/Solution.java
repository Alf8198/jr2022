package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;// напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer num: copy) {
            if (num > 10){
                set.remove(num);
            }
        }// напишите тут ваш код
        return set;
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersGreaterThan10(createSet()));;

    }
}
