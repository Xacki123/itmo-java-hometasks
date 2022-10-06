package ru.tsvetkov.homeworke.hw6.task2.products;

public class Product {
    private String name;
    private Double protein;
    private Double fats;
    private Double carbohydrates;
    private Double calories;

    public Product(String name, Double protein, Double fats, Double carbohydrates, Double calories) {
        setName(name);
        setProtein(protein);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }

    public Product(String name, Double protein, Double fats, Double carbohydrates) {
        setName(name);
        setProtein(protein);
        setFats(fats);
        setCarbohydrates(carbohydrates);
    }


    public Product(String name) {
        setName(name);
    }

    public Product() {
    }

    public void setName(String name) {
        if (name.length() < 3){
            throw new IllegalArgumentException("Название продукта не может быть меньше 3 символов");
        }
        this.name = name;
    }

    public void setProtein(Double protein) {
        if (protein < 0.0){
            throw new IllegalArgumentException("Протеин не может быть отрицательным числом");
        }
        this.protein = protein;
    }

    public void setFats(Double fats) {
        if (protein < 0.0){
            throw new IllegalArgumentException("Жиры не могут быть отрицательным числом");
        }
        this.fats = fats;
    }

    public void setCarbohydrates(Double carbohydrates) {
        if (protein < 0.0){
            throw new IllegalArgumentException("Углеводы не могут быть отрицательным числом");
        }
        this.carbohydrates = carbohydrates;
    }

    public void setCalories(Double calories) {
        if (protein < 0.0){
            throw new IllegalArgumentException("Калории не могут быть отрицательным числом");
        }
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public Double getProtein() {
        return protein;
    }

    public Double getFats() {
        return fats;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", protein=" + protein +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
