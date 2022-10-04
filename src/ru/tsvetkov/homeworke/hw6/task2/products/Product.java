package ru.tsvetkov.homeworke.hw6.task2.products;

public class Product {
    private String name;
    private Double protein;
    private Double fats;
    private Double carbohydrates;
    private Double calories;

    public Product(String name, Double protein, Double fats, Double carbohydrates, Double calories) {
        this.name = name;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String name, Double protein, Double fats, Double carbohydrates) {
        this.name = name;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }


    public Product(String name) {
        this.name = name;
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
        this.protein = protein;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setCalories(Double calories) {
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
