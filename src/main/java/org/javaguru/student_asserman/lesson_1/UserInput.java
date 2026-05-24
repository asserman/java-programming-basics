package org.javaguru.student_asserman.lesson_1;

import org.w3c.dom.ranges.Range;

import java.util.Iterator;
import java.util.Scanner;


public class UserInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter int = ");
        while (scan.hasNextInt()) {
            int number1   = scan.nextInt();
            int number2   = scan2.nextInt();
            System.out.printf("Number1 int = %d\n", number1);
            System.out.printf("Number1 int = %d\n", number2);
        }
    }
}
