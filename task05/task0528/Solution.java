package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date today = new Date(); // зря так написал
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyy");
        System.out.println(format.format(today)); // вместо today можно было написать new Date
        //напишите тут ваш код
    }
}
