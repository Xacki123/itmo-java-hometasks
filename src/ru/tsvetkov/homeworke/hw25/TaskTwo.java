package ru.tsvetkov.homeworke.hw25;

import java.util.concurrent.CopyOnWriteArrayList;

public class TaskTwo implements Runnable{

    CopyOnWriteArrayList<String> strings;

    public TaskTwo(CopyOnWriteArrayList<String> strings){
        this.strings = strings;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(30_000);
            String answer = strings.stream().min((s1, s2) -> s1.length() - s2.length()).orElse("не нашёл");
            strings.remove(answer);
            System.out.println("Минимальная по размеру строка - " + answer);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
