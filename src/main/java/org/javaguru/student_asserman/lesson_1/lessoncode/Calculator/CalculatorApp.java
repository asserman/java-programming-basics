package org.javaguru.student_asserman.lesson_1.lessoncode.Calculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) throws FileNotFoundException {
        Calculator calc = new Calculator();
//        System.out.println("Введите число");
        String fileName = "nums_ev_odd.txt";
        Scanner sc = new Scanner(new File(fileName));
//        while (sc.hasNextInt()) {
//            number1 = sc.nextInt();
//            System.out.printf("is Even %d-> %b\n", number1, calc.isEven(number1));
//            System.out.printf("is Odd %d-> %b\n", number1, calc.isOdd(number1));
//        }

        int number1, number2;
        sc = new Scanner(new File(fileName));
        while (sc.hasNextInt()) {
            number1 = sc.nextInt();
            if (sc.hasNextInt()) {
                number2 = sc.nextInt();
            }else throw new FileNotFoundException(":=->Заметьте, что не хватает второго члена");
            System.out.printf("(%d + %d)/2 = %d \n",number1, number2, calc.findAverage(number1,number2));
        }
    }
}
