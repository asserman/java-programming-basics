package org.javaguru.student_asserman.lesson_1.lessoncode.BankAccount;

import org.javaguru.student_asserman.lesson_1.lessoncode.User;

public class BankAccount {
    private Owner owner;
    private int amount;

    public BankAccount(User user) {
        this.owner = new Owner(user);
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        updateAmount(amount);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int updateAmount(int amount) {
        int res = this.amount + amount;
        try {
            if (res < 0) throw new ArithmeticException();
            this.amount += amount;
        } catch (ArithmeticException e) {
            System.out.printf("отрицательный результат = %d \n", res);
        }

        return amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner=" + owner +
                ", amount=" + amount +
                '}';
    }
}
