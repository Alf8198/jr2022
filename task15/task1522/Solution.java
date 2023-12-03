package com.javarush.task.task15.task1522;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Struct;

/* 
Закрепляем паттерн Singleton
*/

/*Для решения этой задачи тебе нужно:
        1.Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
        2.По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
        3.Реализовать интерфейс Planet в классах Sun, Moon, Earth.
        4.В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
        5.Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
            .для этого считай с консоли один параметр типа String.
            .если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
        Требования:
        •	Класс Sun не должен позволять создавать объекты своего типа за пределами класса.
        •	Класс Sun должен содержать приватное статическое поле instance типа Sun.
        •	В классе Sun должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
        •	Метод getInstance() в классе Sun должен всегда возвращать один и тот же объект.
        •	Поле instance класса Sun должно быть инициализировано только после первого обращения к методу getInstance().
        •	Класс Moon не должен позволять создавать объекты своего типа за пределами класса.
        •	Класс Moon должен содержать приватное статическое поле instance типа Moon.
        •	В классе Moon должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
        •	Метод getInstance() в классе Moon должен всегда возвращать один и тот же объект.
        •	Поле instance класса Moon должно быть инициализировано только после первого обращения к методу getInstance().
        •	Класс Earth не должен позволять создавать объекты своего типа за пределами класса.
        •	Класс Earth должен содержать приватное статическое поле instance типа Earth.
        •	В классе Earth должен быть реализован публичный статический метод getInstance(), возвращающий значение поля instance.
        •	Метод getInstance в классе Earth должен всегда возвращать один и тот же объект.
        •	Поле instance класса Earth должно быть инициализировано только после первого обращения к методу getInstance().
        •	Метод readKeyFromConsoleAndInitPlanet() должен быть вызван в статическом блоке класса Solution.
        •	Метод readKeyFromConsoleAndInitPlanet() должен считывать одну строку с клавиатуры.
        •	Метод readKeyFromConsoleAndInitPlanet() должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
        •	Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try{
            readKeyFromConsoleAndInitPlanet();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput = reader.readLine();

        switch (consoleInput){
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
            default:
                thePlanet = null;
                break;
        }
        // implement step #5 here - реализуйте задание №5 тут
    }
}
