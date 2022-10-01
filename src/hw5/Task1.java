package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // массив из случайных элементов, определить макс, мин и сред арифм
        Scanner in = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int ln = in.nextInt();
        int[] arrayRand = new int[ln];
        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = (int) (Math.random() * (100 + 100) + 1);
        }
        int max = arrayRand[0];
        int min = arrayRand[0];
        int mid = 0;
        for (int i = 0; i < arrayRand.length; i++) {
            if (max < arrayRand[i]) max = arrayRand[i];
            if (min > arrayRand[i]) min = arrayRand[i];
            mid = mid + arrayRand[i];
        }
        System.out.println(Arrays.toString(arrayRand));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Mid = " + mid/arrayRand.length);
    }
}
