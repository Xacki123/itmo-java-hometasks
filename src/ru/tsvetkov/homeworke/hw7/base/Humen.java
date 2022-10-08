package ru.tsvetkov.homeworke.hw7.base;

abstract public class Humen {
    protected String name;
    protected int age;

    public Humen(String name, int age){
        if (name.length() < 3){
            throw new IllegalArgumentException("Имя не может быть меньше 3 символов");
        }
        this.name = name;
        if (age < 7){
            throw new IllegalArgumentException("Возраст в школе должен быть больше 6");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
