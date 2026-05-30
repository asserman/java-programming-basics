package org.javaguru.student_asserman.lesson_1.lessoncode.Book;

public class TestBook {
    public static void main(String[] args) {
        Book[] books = new Book[]{new Book("title1", "Vasay", 2024,
                            new Chapter("chap1", "TextChap1"),
                            new Chapter("chap2", "TextChap1")),
                        new Book("title2", "Serg", 2025,
                            new Chapter("chap0-1", "TextChap0+1"),
                            new Chapter("chap0-2", "TextChap0+1"))};

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
