package ru.tsvetkov.homeworke.hw25;

import java.util.Scanner;

public class SomeThread extends Thread{

    public SomeThread(Runnable runnable){

    }


    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
    }
}
