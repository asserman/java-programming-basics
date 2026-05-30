package org.javaguru.student_asserman.lesson_1.lessoncode.TrueFalse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
//        InputStream stream = new FileInputStream(fileName);
        int lineNumber =0 ;
        String line;
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            lineNumber += sc.nextInt();
        }
        System.out.println(lineNumber);

    }
}
