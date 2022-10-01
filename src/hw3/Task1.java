package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // неотрицательные элементы последовательности
        System.out.println("Задание 1");

        for (int i = 90; i >= 0; i = i - 5) {
            System.out.println(i);
        }


        // вывести первые 10 элементов последовательности
        System.out.println("");
        System.out.println("Задание 2");

        for (int z = 2, count = 0; count < 10; count++, z += 2) {
            System.out.println(z);
        }


        // подсчёт суммы цифр
        System.out.println("");
        System.out.println("Задание 3");

        System.out.println("Введите целое положительное число");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        while (count != 0) {
            sum = sum + (count % 10);
            count /= 10;
        }
        System.out.println(sum);


        // задача с тарелками
        System.out.println("");
        System.out.println("Задание 4");

        System.out.println("Введите количество тарелок");
        int plate = in.nextInt();
        while (true){
            if (plate > 0){
                break;
            } else {
                System.out.println("Введите количество тарелок правильно");
                plate = in.nextInt();
            }
        }

        System.out.println("Введите количество средства");
        double detergent = in.nextDouble();
        while (true){
            if (detergent > 0){
                break;
            } else {
                System.out.println("Введите количество средства правильно");
                detergent = in.nextInt();
            }
        }
        while (plate > 0 && detergent >= 0.5) {
            detergent -= 0.5;
            plate--;
        }
        System.out.println("Тарелок осталось " + plate + " Средства осталось " + detergent);


        // Угадывание числа пользователем
        System.out.println("");
        System.out.println("Задание 5");

        int random = (int) (Math.random() * (9 - 1) + 1);
        while (true) {
            System.out.println("Угадайте число от 1 до 9, для выхода введите 0");
            int userCount = in.nextInt();
            if (userCount == random) {
                System.out.println("Вы угадали");
                break;
            } else if (userCount > random && userCount >= 1 && userCount <= 9) {
                System.out.println("Загаданное число меньше");
            } else if (userCount < random && userCount >= 1 && userCount <= 9) {
                System.out.println("Загаданное число больше");
            } else if (userCount == 0) {
                System.out.println("Выход из программы");
                break;
            } else {
                System.out.println("Введено число не из диапазона");
            }
        }


        // программа угадывает число
        System.out.println("");
        System.out.println("Задание 6");

        int start = 2;
        int end = 100;
        int midl;

        while (true){
            midl = (end + start)/ 2;
            System.out.println("Число равно?" + midl);
            int answ = in.nextInt();
            if (answ == 1) break;
            System.out.println("Больше?" + midl);
            answ = in.nextInt();
            if (answ == 1) start = midl;
            else if (answ == 1) end = midl;
        }
        System.out.println("Твоё число = " + midl);

    }
}
