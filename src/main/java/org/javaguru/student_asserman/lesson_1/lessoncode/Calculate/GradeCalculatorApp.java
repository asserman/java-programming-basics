package org.javaguru.student_asserman.lesson_1.lessoncode.Calculate;

public class GradeCalculatorApp {
    public static void main(String[] args) {
        GradeCalculator calc = new GradeCalculator();
        System.out.println(calc.calculateGrade(70));
        System.out.println(calc.calculateGrade(100));

        System.out.println(new GradeCalculator().calculateGrade(89));
        System.out.println("");
    }
}
