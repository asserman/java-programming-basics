package org.javaguru.student_asserman.lesson_1.lessoncode.Book;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private Chapter chapte1;
    private Chapter chapte2;

    public Book(String title,
                String author,
                int releaseYear,
                Chapter chapte1,
                Chapter chapte2) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapte1 = chapte1;
        this.chapte2 = chapte2;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                ", chapte1=" + chapte1 +
                ", chapte2=" + chapte2 +
                '}';
    }
}
