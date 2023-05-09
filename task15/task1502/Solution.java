package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    public static class Goose extends SmallAnimal{
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }
    public static class Dracon extends BigAnimal{
        @Override
        public String getSize() {
            return  "Дракон большой, " + super.getSize();
        }
    }//добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        Goose goose = new Goose();
        System.out.println(goose.getSize());
        Dracon dracon = new Dracon();
        System.out.println(dracon.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
