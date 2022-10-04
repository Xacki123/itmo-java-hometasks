package ru.tsvetkov.homeworke.hw6.task2.products;

import java.util.Arrays;

public class MyProduct {
    private Double maxProtein;
    private Double maxFats;
    private Double maxCarbohydrates;
    private Double maxCalories;
    private Product[] arrProduct = new Product[3];

    public void setMaxProtein(Double maxProtein) {
        this.maxProtein = maxProtein;
    }

    public void setMaxFats(Double maxFats) {
        this.maxFats = maxFats;
    }

    public void setMaxCarbohydrates(Double maxCarbohydrates) {
        this.maxCarbohydrates = maxCarbohydrates;
    }

    public void setMaxCalories(Double maxCalories) {
        this.maxCalories = maxCalories;
    }

    public void addProduct (Product product){
        for (int i = 0; i < arrProduct.length; i++) {
            if (arrProduct[i] == null && product.getProtein() <= maxProtein && product.getFats()<=maxFats && product.getCarbohydrates()<=maxCarbohydrates&&product.getCalories()<=maxCalories){
                arrProduct[i] = product;
                return;
            }
            if (product.getProtein()>maxProtein){
                throw new IllegalArgumentException("Продукт превышает норму белков");
            }
            if (product.getFats()>maxFats){
                throw new IllegalArgumentException("Продукт превышает норму жиров");
            }
            if (product.getCarbohydrates()>maxCarbohydrates){
                throw new IllegalArgumentException("Продукт превышает норму углеводов");
            }
            if (product.getCalories()>maxCalories){
                throw new IllegalArgumentException("Продукт превышает норму калорий");
            }
        }
    }
    public String showProduct(){
        String resault = "";
        for (int i = 0; i < arrProduct.length; i++) {
            if (arrProduct[i] == null){
                break;
            }
            resault = resault + arrProduct[i].getName() + " ";
        }
        return resault;
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "maxProtein=" + maxProtein +
                ", maxFats=" + maxFats +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", maxCalories=" + maxCalories +
                ", arrProduct=" + Arrays.toString(arrProduct) +
                '}';
    }
}
