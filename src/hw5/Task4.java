package hw5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // сортировка по длинне слова
        String word = "в предложении все слова разной длины";
        String[] arrStr = word.split(" ");
        String max = null;
        for (int i = 0; i < arrStr.length; i++) {
            if (max == null){
                max = arrStr[i];
            }
            if (max.length() < arrStr[i].length()){
                max = arrStr[i];
            }

        }
        System.out.println("Самое длинное слово");
        System.out.println(max);
    }
}
