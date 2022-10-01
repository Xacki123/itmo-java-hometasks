package hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // Массив из чётных чисел в порядке убывания
        int[] array = new int[10];
        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        int[] arrayRevers = new int[10];
        for (int i = 0; i < arrayRevers.length; i++) {
            arrayRevers[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(arrayRevers));
    }
}
