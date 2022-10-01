package hw5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // сортировка по длинне слова
        String word = "в предложении все слова разной длины";
        String[] arrStr = word.split(" ");
        System.out.println("До преобразования");
        System.out.println(Arrays.toString(arrStr));
        Arrays.sort(arrStr);
        System.out.println("После преобразования");
        System.out.println(Arrays.toString(arrStr));
    }
}
