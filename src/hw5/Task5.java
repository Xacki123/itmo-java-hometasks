package hw5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // перенос отрицательных элементов массива в другой массив
        int[] arrInt = {-20, 10, 25, -66, -100};
        int k = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 0) k++;
        }
        Arrays.sort(arrInt);
        int[] newArr = new int[k];
        System.arraycopy(arrInt, 0, newArr, 0, k );
        System.out.println(Arrays.toString(newArr));
    }
}
