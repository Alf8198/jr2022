package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gf1 = new Human("gf1", true, 65);// новые обьекты
        Human gm1 = new Human("gm1", false, 64);//
        Human gf2 = new Human("gf2", true, 68);//
        Human gm2 = new Human("gm2", false, 65);//

        Human f = new Human("f", true, 40, gf1, gm1);
        Human m = new Human("m", false, 38, gf2, gm2);
        Human s1 = new Human("s1", true, 19, f, m);
        Human s2 = new Human("s2", true, 16, f, m);
        Human d1 = new Human("d1", false, 14, f, m);
        System.out.println(gf1);// вывод на экран
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(d1);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }// напишите тут ваш код

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}