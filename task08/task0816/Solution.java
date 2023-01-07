package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирно", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирн", dateFormat.parse("JULY 1 2012"));
        map.put("Смир", dateFormat.parse("MAY 1 2012"));
        map.put("Сми", dateFormat.parse("MAY 1 2012"));
        map.put("См", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновa", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновs", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновd", dateFormat.parse("MAY 1 2012"));
        map.put("Смирноf", dateFormat.parse("MAY 1 2012"));

        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String,Date> copy = new HashMap<>(map);
        for (String key: copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth()+1;
            if (month == 6 || month == 7 || month == 8){
                map.remove(key);
            }
        }//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
