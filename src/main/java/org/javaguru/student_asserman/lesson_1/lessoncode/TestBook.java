package org.javaguru.student_asserman.lesson_1.lessoncode;

public class TestBook {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("book1", 1),
                new Book("book2", 2),
                new Book("book3", 34),
                new Book("book4", 41),
                new Book("book1", 51),
                new Book("book1", 67),
        };
        for (Book book : books) {
            book.updatePage();
            System.out.println(book);
        }
    }
}
