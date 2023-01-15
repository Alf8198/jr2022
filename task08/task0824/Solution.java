package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human son = new Human("Bill",true,15);//напишите тут ваш код
        Human daughter = new Human("Tinki",false,16);//напишите тут ваш код
        Human son1 = new Human("DiBill",true,13);

        Human mother = new Human("Mamka",false,43,son,son1,daughter);
        Human father = new Human("Papka",true,43,son,son1,daughter);

        Human grandFather1 = new Human("Dedka1",true,73,father);
        Human grandMother1 = new Human("Babka1",false,83,father);

        Human grandFather2 = new Human("Dedka2",true,69,mother);
        Human grandMother2 = new Human("Babka2",false,88,mother);

        System.out.println(son);//напишите тут ваш код
        System.out.println(son1);//напишите тут ваш код
        System.out.println(daughter);//напишите тут ваш код
        System.out.println(mother);//напишите тут ваш код
        System.out.println(father);//напишите тут ваш код
        System.out.println(grandFather1);//напишите тут ваш код
        System.out.println(grandMother1);//напишите тут ваш код
        System.out.println(grandFather2);//напишите тут ваш код
        System.out.println(grandMother2);//напишите тут ваш код

    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children){
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }//напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
