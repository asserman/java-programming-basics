package org.javaguru.student_asserman.lesson_1.lessoncode.Cat;

import java.util.LinkedList;

public class CatApp {
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat1 = new Cat("Shnurik", 3);
        Cat cat2 = new Cat("Nuto", 4);
        cats.add(cat1); cats.add(cat2);
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        cat2 = null;
        cats.add(cat2);

        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }


        cat2 = new Cat("Shnurik", 2);
    }
}
