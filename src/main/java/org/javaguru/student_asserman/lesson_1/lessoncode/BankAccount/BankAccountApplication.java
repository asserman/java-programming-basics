package org.javaguru.student_asserman.lesson_1.lessoncode.BankAccount;

import org.javaguru.student_asserman.lesson_1.lessoncode.User;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApplication {
    static public void printBankAccounts(List<BankAccount> bankAccounts) {
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(new User(01, "Sergey", 51));
        BankAccount account2 = new BankAccount(new User(02, "Lena", 50));
        BankAccount account3 = new BankAccount(new User(03, "Vasya", 52));
        BankAccount account4 = new BankAccount(new User(04, "Sergey", 51));
        BankAccount account5 = new BankAccount(new User(05, "Valya", 70));

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        printBankAccounts(accounts);

        account1.updateAmount(-78);
        account1.updateAmount(100);
        account2.updateAmount(200);
        printBankAccounts(accounts);

        account1.updateAmount(-100);
        account2.updateAmount(-120);
        account3.updateAmount(-550);
        printBankAccounts(accounts);
        for(BankAccount bankAccount : accounts)
            System.out.printf("BankAccount{owner=%s, amount=%d}\n", account1.getOwner(), account1.getAmount());
    }
}
