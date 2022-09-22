package hw1;

public class Task3 {
    public static void main(String[] args) {
        //  Сумма цифр двухзначного числа
        int a = 45;
        int b = 11;
        a = a / 10 + a%10;
        b = b / 10 + b%10;
        System.out.println("Для числа a сумма цифр = " + a);
        System.out.println("Для числа b сумма цифр = " + b);
    }
}
