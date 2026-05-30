package org.javaguru.student_asserman.lesson_1.lessoncode.Calculate;

public class GradeCalculator {
    char calculateGrade(int mark) {
        char grade = '*';
        if ((mark >= 90) && (mark <= 100)) {
            grade = 'A';
        } else if ((mark >= 80) && (mark <= 89)) {
            grade = 'B';
        } else if ((mark >= 70) && (mark <= 79)) {
            grade = 'C';
        } else if ((mark >= 60) && (mark <= 69)) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
