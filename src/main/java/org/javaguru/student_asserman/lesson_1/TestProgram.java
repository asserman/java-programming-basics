package org.javaguru.student_asserman.lesson_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

class TestProgram {

    static Integer test = 34;

    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        String text = "А Это беспощадный русский текст";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_16);
        System.out.println();
        Integer integer = null;
        test = Integer.sum(test, 0);
        System.out.printf("тест == %d ", test);

        for (int i = 0; i < bytes.length; i += 2) {
            System.out.printf("%s", new String(new byte[]{bytes[i], bytes[i + 1]}, StandardCharsets.UTF_16));
        }
        System.out.println();
        fileOutputStream.write(bytes);
        fileOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_16));
        fileOutputStream.close();


    }
}
