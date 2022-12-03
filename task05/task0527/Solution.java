package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 25, 18);
        Dog dog = new Dog("Dog", 32 , 4);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tall;

        public Cat(String name, int height, int tall) {
            this.name = name;
            this.height = height;
            this.tall = tall;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tall;

        public Dog(String name, int height, int tall) {
            this.name = name;
            this.height = height;
            this.tall = tall;
        }
    }

    //напишите тут ваш код
}
