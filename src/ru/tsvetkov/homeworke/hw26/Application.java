package ru.tsvetkov.homeworke.hw26;

public class Application {
    public static void main(String[] args) {
        Account account1 = new Account(01,100);
        Account account2 = new Account(02,100);

        Bank bank = new Bank();
        bank.transferMoney(account1,account2,10);
        bank.transferMoney(account2,account1, 100);




    }
}
