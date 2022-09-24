package hw1;

public class Task1 {
    public static void main(String[] args) {
        // вычисление площади прямоугольного параллелепипеда
        int width = 2; // Ширина
        int height = 2; // высота
        int lng = 2; // длинна
        int s = 2*(width * height + height * lng + lng * width); // площадь
        System.out.println("Площадь = " + s);

        // вывести число в кубе
        int a = 2; // число
        a = a * a * a;
        System.out.println("Куб = " + a);

        // Вычисление скорости в м/с
        double t = 2.0; // время в часах
        double h = 16.0; // растояние км
        double v; // скорость
        v = h/t*1000/3600;
        System.out.println("Скорость = " + v + " м/с");
    }
}
