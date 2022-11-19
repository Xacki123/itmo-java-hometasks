package ru.tsvetkov.homeworke.hw25;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskOne implements Runnable{


    CopyOnWriteArrayList<String> strings;

    public TaskOne(CopyOnWriteArrayList<String> strings){
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку");
            String userString = scanner.next();
            strings.add(userString);
        }
    }
}
