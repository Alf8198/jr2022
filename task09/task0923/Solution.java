package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String s = bufferedReader.readLine();

        StringBuffer sbVowels = new StringBuffer();
        StringBuffer sbNotVowels = new StringBuffer();

        for (char character : s.toCharArray()) {
            if (isVowel(character)) {
                sbVowels.append(character).append(" ");
            } else if (character != ' ') {
                sbNotVowels.append(character).append(" ");
            }
        }

        System.out.println(sbVowels);
        System.out.println(sbNotVowels);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}