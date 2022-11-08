package ru.tsvetkov.homeworke.hw20.base;

import ru.tsvetkov.homeworke.hw20.units.Infantry;
import ru.tsvetkov.homeworke.hw20.units.Knight;

import java.io.Serializable;

abstract public class BattleUnit extends Unit implements Serializable {
    protected int attackScore;

    public BattleUnit(int health, int attackScore){
        super(health);
        if (attackScore < 1){
            throw new IllegalArgumentException("Атака не может быть меньше 1");
        }
        this.attackScore = attackScore;
    }


    public int getAttackScore(){
        return attackScore;
    }

    //метод без реализации
    abstract public void attack(BattleUnit enemy);

    // фабричный метод
    public static BattleUnit getBattleUnit(){
        String[] types = {"knight", "infantry"};
        // тип создаваемого юнита определяется рандомом
        // в зависимости от типа создаём того или иного юнита
        int typeInt = (int) (Math.random() * types.length);
        if (typeInt == 1){
            System.out.println("Создаётся knight");
            Knight unit = new Knight(50, 20, 5);
            return unit;
        }

        System.out.println("Создаётся infantry");
        Infantry unit = new Infantry(30, 20, 2);
        return unit;
    }

    public static BattleUnit[] getBattleUnits(int count){
        BattleUnit[] units = new BattleUnit[count];
        for (int i = 0; i < units.length ; i++) {
            // в статических методах можно вызвать только другие статические свойства или вызвать метод
            units[i] = getBattleUnit();
        }
        return units;
    }
}
