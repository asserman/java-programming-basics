package org.javaguru.student_asserman.lesson_1.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApplication {
    static public void printBankAccounts(List <BankAccount> bankAccounts) {
        for(BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount account1 =new BankAccount(new User(01, "Sergey", 51));

        BankAccount account2 =new BankAccount(new User(02, "Lena", 50));
        BankAccount account3 =new BankAccount(new User(03, "Vasya", 52));

        List <BankAccount> accounts =  new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        printBankAccounts(accounts);
        account2.updateAmount(200);
        account1.updateAmount(100);

        printBankAccounts(accounts);
        account2.updateAmount(-120);
        account1.updateAmount(-78);

        printBankAccounts(accounts);

        System.out.printf("%SS %d",account1.getOwner() ,account1.getAmount());
    }
}
