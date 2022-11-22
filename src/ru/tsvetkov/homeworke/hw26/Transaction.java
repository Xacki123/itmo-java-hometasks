package ru.tsvetkov.homeworke.hw26;

public class Transaction implements Runnable{
    private Account src; // с какого аккаунта осуществлять перевод
    private Account dst; // на какой аккаунт осуществлять перевод
    private int money; // сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }

    @Override
    public void run() {
        // TODO перевод денежных средств со счета src на счет dst в количестве money
        if (src.equals(null) || dst.equals(null)){
            System.out.println("Счёт пустая ссылка");
            return;
        }
        if (!(src.getBalance() >= money)) {
            System.out.println("Денег на счёте не хватает");
            return;
        }
        synchronized (src) {
            src.setBalance(src.getBalance() - money);
            System.out.println("Денги с аккаунта " + src.getId() + " переведены");

        }
        synchronized (dst) {
            dst.setBalance(dst.getBalance() + money);
            System.out.println("Деньги зачислены на аккаунт " + dst.getId());
        }
        System.out.println("Счёт аккаунта " + src.getId() + " " + src.getBalance());
        System.out.println("Счёт аккаунта  " + dst.getId() + " " + dst.getBalance());
    }
}
