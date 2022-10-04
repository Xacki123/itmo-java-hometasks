package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // добавление уникальных слов в массив
        Scanner in = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int ln = in.nextInt();
        String answer;
        String[] array = new String[ln];
        for (int j = 0; j < array.length; ) {
            System.out.println("введите слово");
            answer = in.next();
            if (answer.equals("exit")) break;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null){
                    array[i] = answer;
                    j++;
                    break;
                }
                if (array[i].equals(answer)){
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
