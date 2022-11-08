package ru.tsvetkov.homeworke.hw20.units;

import ru.tsvetkov.homeworke.hw20.base.BattleUnit;

import java.io.Serializable;

public final class Infantry extends BattleUnit implements Serializable {
    private int additionaAttack;

    public Infantry (int health, int attackScore, int additionaAttack){
        super(health, attackScore);
        if (additionaAttack < 1){
            throw new IllegalArgumentException("Дополнительная атака не может быть меньше нуля");
        }
        this.additionaAttack = additionaAttack;
    }
    public void upAttack(){
        additionaAttack += (int) (Math.random() * 3);
    }

    @Override
    public void attack(BattleUnit enemy){
        enemy.minusHealth(attackScore + additionaAttack);
        System.out.println("Infantry атакует на " + (attackScore + additionaAttack));
    }

    @Override
    public String toString() {
        return "Infantry{" +
                "additionaAttack=" + additionaAttack +
                ", attackScore=" + attackScore +
                ", healthScore=" + healthScore +
                '}';
    }
}