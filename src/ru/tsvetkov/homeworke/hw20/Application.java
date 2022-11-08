package ru.tsvetkov.homeworke.hw20;

import ru.tsvetkov.homeworke.hw20.base.BattleUnit;
import ru.tsvetkov.homeworke.hw20.base.Kingdom;
import ru.tsvetkov.homeworke.hw20.units.Infantry;
import ru.tsvetkov.homeworke.hw20.units.King;
import ru.tsvetkov.homeworke.hw20.units.Knight;

public class Application {
    public static void main(String[] args) {

        King king1 = new King(100);
        King king2 = new King(100);


        // проверка генерации юнитов
        king1.generateArmy();


        Kingdom kingdom = new Kingdom(king1);
        //System.out.println(kingdom);
        // сохранение королевства
        System.out.println("");
        kingdom.saveKingdom();
        Kingdom kingdom1 = kingdom.loadKingdom();
        System.out.println("Выгруженное королевство " + kingdom1 );




    }
}