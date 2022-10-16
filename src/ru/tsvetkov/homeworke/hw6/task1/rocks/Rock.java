package ru.tsvetkov.homeworke.hw6.task1.rocks;

public class Rock {
    private String name;
    private String country;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 4){
            throw new IllegalArgumentException("Имя горы должно быть не менее 4 символов");
        }
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 4){
            throw new IllegalArgumentException("Страна не может быть менее 4 символов");
        }
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 100){
            throw new IllegalArgumentException("Гора не должна быть меньше 100 метров");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rock{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
