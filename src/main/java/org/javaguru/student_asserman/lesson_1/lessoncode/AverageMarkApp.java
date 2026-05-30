package org.javaguru.student_asserman.lesson_1.lessoncode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageMarkApp {
    private static int getStudentCounterFromUser() throws FileNotFoundException {

        System.out.println("Enter student counter  : ");
        return  new Scanner(new File("nums_ev_odd.txt")).nextInt();
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(getStudentCounterFromUser());
    }
}
