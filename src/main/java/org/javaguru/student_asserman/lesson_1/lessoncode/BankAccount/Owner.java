package org.javaguru.student_asserman.lesson_1.lessoncode.BankAccount;

import org.javaguru.student_asserman.lesson_1.lessoncode.User;

public class Owner {
    private User user;

    public Owner(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "user=" + user +
                '}';
    }
}
