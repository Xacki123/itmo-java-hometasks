package ru.tsvetkov.homeworke.hw6.task3;

import ru.tsvetkov.homeworke.hw6.task3.cats.Cat;
import ru.tsvetkov.homeworke.hw6.task3.cats.Mouse;

public class Application {
    public static void main(String[] args) {
        //создаю мышей
        Mouse mouse1 = new Mouse(1.0);
        Mouse mouse2 = new Mouse(3.0);
        Mouse mouse3 = new Mouse(4.0);
        Mouse mouse4 = new Mouse(5.0);
        Mouse mouse5 = new Mouse(10.0);

        // создаю котов
        Cat cat1 = new Cat("Борис", 8.0, 5.0);
        Cat cat2 = new Cat("Барсик", 12.0, 10.0);

        // коты ловят мышей
        cat1.addMouse(mouse1);
        cat1.addMouse(mouse2);

        cat2.addMouse(mouse3);
        cat2.addMouse(mouse4);
        cat2.addMouse(mouse5);

        // вывожу кого поймали коты
        System.out.println(cat1.showMouseCat());
        System.out.println(cat2.showMouseCat());

        // драка котов
        cat2.attackCat(cat1);

        // вывожу кого поймали коты
        System.out.println(cat1.showMouseCat());
        System.out.println(cat2.showMouseCat());

        // драка котов
        cat1.attackCat(cat2);

        // вывожу кого поймали коты
        System.out.println(cat1.showMouseCat());
        System.out.println(cat2.showMouseCat());

    }
}
