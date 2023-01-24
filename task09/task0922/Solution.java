package com.javarush.task.task09.task0922;

import javafx.beans.property.SimpleObjectProperty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        String inputScanner = scanner.nextLine();

        SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date date = inputDate.parse(inputScanner);

        SimpleDateFormat outputDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(outputDate.format(date).toUpperCase());
    }
}
