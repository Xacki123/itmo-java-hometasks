package ru.tsvetkov.homeworke.hw25;

import java.util.concurrent.CopyOnWriteArrayList;

public class Application {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();

        TaskOne taskOne = new TaskOne(strings);
        TaskTwo taskTwo = new TaskTwo(strings);

        Thread thread01 = new Thread(taskOne);
        thread01.setDaemon(true);
        Thread thread02 = new Thread(taskTwo);

        thread01.start();
        thread02.start();
    }



}
