package ru.tsvetkov.homeworke.hw20.units;

import ru.tsvetkov.homeworke.hw20.base.BattleUnit;

import java.io.Serializable;

public final class Knight extends BattleUnit implements Serializable {
    private int addHealth;
    public Knight (int health, int attackScore, int addHealth){
        super(health,attackScore);
        if (addHealth < 1){
            throw new IllegalArgumentException("Повышенеи здоровье должно быть больше 1");
        }
        this.addHealth = addHealth;
    }


    @Override
    public void attack(BattleUnit enemy) {
        enemy.minusHealth(attackScore);
        plusHealth(addHealth);
        System.out.println("Knight атакует на " + attackScore + " и добавляет здоровье на " + addHealth);

    }

    @Override
    public String toString() {
        return "Knight{" +
                "addHealth=" + addHealth +
                ", attackScore=" + attackScore +
                ", healthScore=" + healthScore +
                '}';
    }
}