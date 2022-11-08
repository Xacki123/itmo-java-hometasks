package ru.tsvetkov.homeworke.hw20.units;

import ru.tsvetkov.homeworke.hw20.base.AppSettings;
import ru.tsvetkov.homeworke.hw20.base.BattleUnit;
import ru.tsvetkov.homeworke.hw20.base.Unit;

import java.io.Serializable;
import java.util.Arrays;

public class King extends Unit implements Serializable {
    private int gold = AppSettings.GOLD;
    private BattleUnit[] army;

    public King(int healthScore){
        super(healthScore);
    }


    public BattleUnit[] getArmy() {
        return army;
    }

    // первоначальное создание армии
    public void generateArmy(){
        if (gold < AppSettings.ARMY_PRICE){
            System.out.println("Стоимость армии" + AppSettings.ARMY_PRICE);
            return;
        }
        gold -= AppSettings.ARMY_PRICE;
        // создание армии юнитов
        army = BattleUnit.getBattleUnits(AppSettings.UNITS_COUNT);
    }

    public void updateArmy(){
        for (int i = 0; i < army.length; i++) {
            if (gold < AppSettings.UNIT_PRICE){
                System.out.println("Стоимость юнита" + AppSettings.UNIT_PRICE);
                return;
            }
            if (!army[i].isAlive()){
                gold -=AppSettings.UNIT_PRICE;
                // создание нового юнита
                army[i] = BattleUnit.getBattleUnit();
            }

        }
    }
    public void startBattle(King enemy){
        // война армий
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Битва началась");
        for (int i = 0; i < AppSettings.UNITS_COUNT; i++) {
            if (!this.army[i].isAlive() && !enemy.army[i].isAlive()){
                System.out.println("Воины обоих королей пали");
                continue;
            }
            if (!this.army[i].isAlive()){
                System.out.println("Воин атакующего короля пал, нанесён урон королю " + (enemy.army[i].getAttackScore()/4));
                minusHealth(enemy.army[i].getAttackScore()/4);
                continue;
            }
            if (!enemy.army[i].isAlive()){
                System.out.println("Воин защищающегося короля пал, нанесён урон по королю " + (this.army[i].getAttackScore()/4));
                enemy.minusHealth(this.army[i].getAttackScore()/4);
                continue;
            }
            this.army[i].attack(enemy.army[i]);
            enemy.army[i].attack(this.army[i]);
        }
    }

    public  int getGold(){
        return  gold;
    }
    //переопределение метода
    @Override
    public void rest(){
        if (gold < AppSettings.REST_PRICE) return;
        gold -=AppSettings.REST_PRICE;
        super.rest();
        System.out.println("King возрождён");
    }

    public final void rest(Unit unit){
        if (gold < 20) return;
        gold -=20;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("King и Unit возрождён");
    }

    @Override
    public String toString() {
        return "King{" +
                "gold=" + gold +
                ", army=" + Arrays.toString(army) +
                '}';
    }
}