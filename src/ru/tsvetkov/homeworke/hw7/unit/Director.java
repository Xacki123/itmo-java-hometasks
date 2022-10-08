package ru.tsvetkov.homeworke.hw7.unit;

import ru.tsvetkov.homeworke.hw7.base.Humen;

public class Director extends Humen {
    public Director(String name, int age){
        super(name,age);
    }
    public void start(){
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("Начало занятий");
    }
    public void end(){
        System.out.println("Окончание занятий");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
