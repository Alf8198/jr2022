package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);//напишите тут ваш код
        String s = scanner.nextLine();

        StringBuffer bufferVowels = new StringBuffer();
        StringBuffer bufferNotVowels = new StringBuffer();

        for (char ch : s.toCharArray()) {
            if(isVowel(ch)){
                bufferVowels.append(ch).append(" ");
            } else if (ch != ' ') {
                bufferNotVowels.append(ch).append(" ");
            }
        }

        System.out.println(bufferVowels);
        System.out.println(bufferNotVowels);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character){
        character = Character.toLowerCase(character);
        for (char vowel: vowels) {
            if (character == vowel){
                return true;
            }
        }
        return false;
    }
}