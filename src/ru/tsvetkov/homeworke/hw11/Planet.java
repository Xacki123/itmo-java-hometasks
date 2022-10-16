package ru.tsvetkov.homeworke.hw11;

public enum Planet {
    Земля(1000.0, 1000.0, "Земля"), Марс(2000.0, 2000.0, "Марс"), Сатурн(1000.0, 4000.0, "Сатурн");

    //Свойства
    private double massa;
    private double radius;
    private String name;

    //Конструктор
    Planet(double massa, double radius, String name){
        setMassa(massa);
        setRadius(radius);
        setName(name);
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        if (massa<0.0){
            throw new IllegalArgumentException("Масса не может быть меньше нуля");
        }
        this.massa = massa;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0.0){
            throw new IllegalArgumentException("Радиус не может быть меньше нуля");
        }
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3){
            throw new IllegalArgumentException("Название планеты должно быть больше 2 символов");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "Масса=" + massa +
                ", Радиус=" + radius +
                ", Название планеты='" + name + '\'' +
                '}';
    }
}
