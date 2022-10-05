package ru.tsvetkov.homeworke.hw6.task2;

import ru.tsvetkov.homeworke.hw6.task2.products.MyProduct;
import ru.tsvetkov.homeworke.hw6.task2.products.Product;

public class Application {
    public static void main(String[] args) {
        // создаю продукты
        Product product1 = new Product("Абрикос",1.0,0.0,10.0,45.0);
        Product product2 = new Product("Авокадо",2.0,19.0,7.0,197.0);
        Product product3 = new Product("Банан",3.0,3.0,22.0,97.0);
        Product product4 = new Product("Изюм",2.0,0.0,68.0,280.0);

        // формирую границы
        MyProduct myProduct = new MyProduct();
        myProduct.setMaxProtein(12.0);
        myProduct.setMaxFats(20.0);
        myProduct.setMaxCarbohydrates(30.0);
        myProduct.setMaxCalories(100.0);

        // заполняю список
        myProduct.addProduct(product1);
        myProduct.addProduct(product3);

        // вывод продуктов из списка
        System.out.println(myProduct.showProduct());




    }
}
