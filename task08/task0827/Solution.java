package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long res = currentDate.getTime() - startDate.getTime();
        long days = res / 24 / 60 / 6000 + 1;
        return days % 2 == 1;

        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH); //формат  в котором принимаем значение
        Calendar parseDate = new GregorianCalendar(); // создаем календарь
        try { // проверка на исключение
            parseDate.setTime(simpleDateFormat.parse(date)); //парсим строку в календарь
        } catch (ParseException e){ // если выкинет ошибку
            e.printStackTrace();
        }
        int days = parseDate.get(Calendar.DAY_OF_YEAR);// вычисляем количество дней с начала года
        return days % 2 != 0; //  деление с остатком возвращаем true or false*/
    }
}
