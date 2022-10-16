package ru.tsvetkov.homeworke.hw6.task1.rocks;

public class Mountaineer {
    private String name;
    private String addres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Имя должно быть не менее 3 символов");
        }
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        if (addres == null || addres.length() < 5) { // проверка на null
            throw new IllegalArgumentException("Адрес должен быть не менее 5 символов");
        }
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Mountaineer{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
