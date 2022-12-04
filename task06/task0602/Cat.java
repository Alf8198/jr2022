package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.finalize();
        dog.finalize();

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
    //напишите тут ваш код

}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
    //напишите тут ваш код
}
