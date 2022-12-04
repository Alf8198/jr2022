package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return dist;//напишите тут ваш код
        //Метод Math.pow() – возводит значение первого аргумента в степень второго аргумента,
        //тем самым позволяет осуществить быстрое возведение в степень любых значений. (x2-x1),2

        //sqrt(sqr(x2-x1)+sqr(y2-y1)
        //корень из суммы разниц в квадратах

        /*
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
        */
    }

    public static void main(String[] args) {

    }
}
