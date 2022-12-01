package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("srfasf", 5, "fsdgdg");
        Man man2 = new Man("fggdfgg", 15, "dgfgfgdfg");

        Woman woman1 = new Woman("dgsrgfdg", 25, "ggdfg");
        Woman woman2 = new Woman("ggdfgfrg", 12, "gfdfgf");

        System.out.println(man1);//напишите тут ваш код
        System.out.println(man2);//напишите тут ваш код
        System.out.println(woman1);//напишите тут ваш код
        System.out.println(woman2);//напишите тут ваш код
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man (String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
             return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    //напишите тут ваш код
}
