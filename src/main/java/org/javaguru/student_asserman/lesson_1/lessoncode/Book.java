package org.javaguru.student_asserman.lesson_1.lessoncode;


public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void updatePage() {
        pageCount = (pageCount/10+1) *10;
    }
}
