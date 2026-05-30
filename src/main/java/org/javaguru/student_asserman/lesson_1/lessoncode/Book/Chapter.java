package org.javaguru.student_asserman.lesson_1.lessoncode.Book;


public class Chapter {
    private String title;
    private String test;

    public Chapter(String title, String test) {
        this.title = title;
        this.test = test;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", test='" + test + '\'' +
                '}';
    }
}
