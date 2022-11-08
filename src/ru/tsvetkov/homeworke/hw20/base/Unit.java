package ru.tsvetkov.homeworke.hw20.base;

import java.io.Serializable;

abstract public class Unit implements Serializable {
    protected int healthScore;
    private final int maxHealthScor;

    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("Здоровье не может быть меньше 1");
        }
        this.healthScore = healthScore;
        maxHealthScor = healthScore;
    }
    public int getHealthScore() {
        return healthScore;
    }
    public boolean isAlive() {
        if (healthScore <= 0) return false;
        return true;
    }

    public void plusHealth(int healthScore) {
        if (isAlive()){
            this.healthScore+= healthScore;
            if (this.healthScore > maxHealthScor){
                this.healthScore = maxHealthScor;
            }
        }

    }

    public void minusHealth(int healthScore) {
        if (isAlive()) {
            this.healthScore -= healthScore;
            if (this.healthScore < 0) this.healthScore=0;
        }

    }

    public void rest(){
        plusHealth(1);
        System.out.println("Unit возродился");
    }
}