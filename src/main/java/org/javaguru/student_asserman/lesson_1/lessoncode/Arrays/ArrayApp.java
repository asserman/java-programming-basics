package org.javaguru.student_asserman.lesson_1.lessoncode.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayApp {


    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        Arrays.stream(numbers).map(x -> 100- x).filter(x->x<50).forEach(System.out::println);

    }
}
