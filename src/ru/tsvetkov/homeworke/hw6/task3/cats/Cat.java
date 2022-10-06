package ru.tsvetkov.homeworke.hw6.task3.cats;

import java.util.Arrays;

public class Cat {
    private String name;
    private double speedCat;
    private double weight;
    private Mouse[] arrMouse = new Mouse[100];

    public Cat(String name, double speedCat, double weight) {
        setName(name);
        setSpeedCat(speedCat);
        setWeight(weight);
    }
    public Cat(){}

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Кличка не может быть мень 3 символов");
        }
        this.name = name;
    }

    public void setSpeedCat(double speedCat) {
        if (speedCat < 0.0){
            throw new IllegalArgumentException("Скорость не может быть отрицательной");
        }
        this.speedCat = speedCat;
    }

    public void setWeight(double weight) {
        if (weight < 0.0){
            throw new IllegalArgumentException("Вес не может быть отрицательным");
        }
        this.weight = weight;
    }

    public void addMouse(Mouse mouse) {
        if (speedCat > mouse.getSpeedMouse()) {
            for (int i = 0; i < arrMouse.length; i++) {
                if (arrMouse[i] == null) {
                    arrMouse[i] = mouse;
                    return;
                }
            }
        }
        System.out.println("Кот "+ name+  " промахнулся");
    }

    public void attackCat(Cat cat) {
        if (weight > cat.weight) {
            for (int j = 0; j < cat.arrMouse.length; j++) {
                if (cat.arrMouse[j] == null){
                    return;
                }
                addMouse(cat.arrMouse[j]);
                cat.arrMouse[j] = null;
            }
        } else {
            System.out.println("Кот "+  name + " не смог одолеть такого противника как " + cat.name + " и отступил");
            cat.attackCat(this);
        }
    }

    public String showMouseCat(){
        String resoult = "Кот " + name + " поймал: ";
        for (int i = 0; i < arrMouse.length; i++) {
            if (arrMouse[i] == null){
                break;
            }
            resoult = resoult + "Мышь- " + arrMouse[i].getSpeedMouse() + " ";
        }
        return resoult;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speedCat=" + speedCat +
                ", weight=" + weight +
                ", arrMouse=" + Arrays.toString(arrMouse) +
                '}';
    }
}
