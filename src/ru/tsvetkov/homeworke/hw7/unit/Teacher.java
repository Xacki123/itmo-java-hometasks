package ru.tsvetkov.homeworke.hw7.unit;

import ru.tsvetkov.homeworke.hw7.base.TeachHumen;

public class Teacher extends TeachHumen {
    public Teacher(String name, int age, String nameStudySubject, int level){
        super(name,age,nameStudySubject, level);
    }

    @Override
    public void teach(TeachHumen teachHumen){
        teachHumen.setLevel(teachHumen.getLevel() +(int) (Math.random() * getLevel()));
        System.out.println("Уровень студента " + teachHumen.getLevel() + 1);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameStudySubject='" + nameStudySubject + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
