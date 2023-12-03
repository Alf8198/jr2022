package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/
//В этой задаче тебе нужно:
//        Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
//        Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
//        В статическом методе reset() класса Solution:
//        считать с консоли параметр типа String;
//        если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
//        если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
//        В статическом блоке инициализировать CanFly result, вызвав метод reset().
//        Закрыть поток ввода методом close().
//        Требования:
//        •	Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
//        •	Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
//        •	Класс Plane должен иметь конструктор с параметром int.
//        •	В классе Solution должен быть реализован метод public static void reset().
//        •	Метод reset() должен считывать строки с клавиатуры.
//        •	Если введенная строка равна "helicopter", в переменную result должен быть сохранен объект типа Helicopter.
//        •	Если введенная строка равна "plane", в переменную result должен быть сохранен объект типа Plane.
//        •	Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова метода reset().

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String key = reader.readLine();
            if (key.equals("plane")){
                key = reader.readLine();
                result = new Plane(Integer.parseInt(key));
            }else if (key.equals("helicopter")){
                result = new Helicopter();
            }
        }catch (IOException e){
            e.printStackTrace();//add your code here - добавьте код тут
        }
    }
}
//IllegalArgumentException — это тип RuntimeException, который возникает, когда метод вызывается с недопустимым или неподходящим аргументом. Иными словами, такая ошибка может произойти, когда метод вызывается с аргументом, выходящим за пределы ожидаемого диапазона или не имеющим ожидаемого формата или структуры. Например, методу требуется положительное число в качестве аргумента, а мы предоставляем отрицательное число, что является недопустимым вводом.
//
//        Если вы столкнулись с IllegalArgumentException, вам следует проверить свой код, чтобы убедиться, что вы вызываете методы с допустимыми и соответствующими аргументами.