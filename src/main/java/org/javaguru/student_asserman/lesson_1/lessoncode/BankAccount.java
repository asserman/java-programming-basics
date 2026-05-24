package org.javaguru.student_asserman.lesson_1.lessoncode;

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
        this.amount = amount;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int updateAmount(int amount){
        this.amount+=amount;
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
