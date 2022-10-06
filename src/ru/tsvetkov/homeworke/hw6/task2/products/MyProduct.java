package ru.tsvetkov.homeworke.hw6.task2.products;

import java.util.Arrays;

public class MyProduct {
    private Double maxProtein;
    private Double maxFats;
    private Double maxCarbohydrates;
    private Double maxCalories;
    private Product[] arrProduct;

    public MyProduct(int massLen, Double maxProtein, Double maxFats, Double maxCarbohydrates, Double maxCalories){
        arrProduct = new Product[massLen];
        setMaxProtein(maxProtein);
        setMaxFats(maxFats);
        setMaxCarbohydrates(maxCarbohydrates);
        setMaxCalories(maxCalories);
    }
    public void setMaxProtein(Double maxProtein) {
        if (maxProtein < 0.0){
            throw new IllegalArgumentException("max Протеин не может быть отрицательным числом");
        }
        this.maxProtein = maxProtein;
    }

    public void setMaxFats(Double maxFats) {
        if (maxFats < 0.0){
            throw new IllegalArgumentException(" max Жиры не могут быть отрицательным числом");
        }
        this.maxFats = maxFats;
    }

    public void setMaxCarbohydrates(Double maxCarbohydrates) {
        if (maxCarbohydrates < 0.0){
            throw new IllegalArgumentException("max Углеводы не могут быть отрицательным числом");
        }
        this.maxCarbohydrates = maxCarbohydrates;
    }

    public void setMaxCalories(Double maxCalories) {
        if (maxCalories < 0.0){
            throw new IllegalArgumentException("max Калории не могут быть отрицательным числом");
        }
        this.maxCalories = maxCalories;
    }

    public void addProduct (Product product){
        for (int i = 0; i < arrProduct.length; i++) {
            if (arrProduct[i] == null && product.getProtein() <= maxProtein && product.getFats()<=maxFats && product.getCarbohydrates()<=maxCarbohydrates&&product.getCalories()<=maxCalories){
                arrProduct[i] = product;
                return;
            }
            if (product.getProtein()>maxProtein){
                System.out.println("Продукт "+ product.getName() +  " превышает норму белков");
                return;
            }
            if (product.getFats()>maxFats){
                System.out.println("Продукт "+ product.getName() + " превышает норму жиров");
                return;
            }
            if (product.getCarbohydrates()>maxCarbohydrates){
                System.out.println("Продукт "+ product.getName() + " превышает норму углеводов");
                return;
            }
            if (product.getCalories()>maxCalories){
                System.out.println("Продукт "+ product.getName() + " превышает норму калорий");
                return;
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
