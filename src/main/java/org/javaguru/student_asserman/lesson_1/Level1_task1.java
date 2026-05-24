package org.javaguru.student_asserman.lesson_1;


public class Level1_task1 {

    public static void main(String[] args) {
        System.out.println(args.length);
        for (String string : args) {
            System.out.println(string);
        }

        try {
            System.out.println(args[0]);

        } catch (Exception e) {
            System.out.println("0 args error");
        }

    }
}

