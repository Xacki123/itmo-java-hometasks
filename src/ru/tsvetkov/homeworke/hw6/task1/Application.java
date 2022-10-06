package ru.tsvetkov.homeworke.hw6.task1;

import ru.tsvetkov.homeworke.hw6.task1.rocks.Group;
import ru.tsvetkov.homeworke.hw6.task1.rocks.Mountaineer;
import ru.tsvetkov.homeworke.hw6.task1.rocks.Rock;

public class Application {
    public static void main(String[] args) {

        // создаю горы
        Rock rock1 = new Rock();
        rock1.setName("Гора1");
        rock1.setCountry("Россия");
        rock1.setHeight(120);

        Rock rock2 = new Rock();
        rock2.setName("Гора2");
        rock2.setCountry("Китай");
        rock2.setHeight(1200);

        Rock rock3 = new Rock();
        rock3.setName("Гора3");
        rock3.setCountry("Италия");
        rock3.setHeight(2000);

        // создаю альпинистов
        Mountaineer mountaineer1 = new Mountaineer();
        mountaineer1.setName("Вован");
        mountaineer1.setAddres("Moscow");

        Mountaineer mountaineer2 = new Mountaineer();
        mountaineer2.setName("Лексус");
        mountaineer2.setAddres("Moscow");

        Mountaineer mountaineer3 = new Mountaineer();
        mountaineer3.setName("Алёна");
        mountaineer3.setAddres("Moscow");

        //формирую группы
        Group group1 = new Group();
        group1.setRock(rock1);
        group1.addMountaineer(mountaineer1);
        group1.addMountaineer(mountaineer2);
        group1.addMountaineer(mountaineer3);
        group1.addMountaineer(mountaineer3);

        Group group2 = new Group();
        group2.setRock(rock2);
        group2.addMountaineer(mountaineer1);
        group2.addMountaineer(mountaineer2);

        Group group3 = new Group();
        group3.setRock(rock3);
        group3.addMountaineer(mountaineer2);
        group3.addMountaineer(mountaineer3);
    }
}
