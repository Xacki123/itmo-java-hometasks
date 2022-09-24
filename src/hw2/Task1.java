package hw2;

public class Task1 {
    public static void main(String[] args) {
        // Определить время года по номеру месяца
        int month = 5;
        if (month >= 1 && month <= 2 || month == 12) System.out.println("Зима");
        else if (month >= 3 && month <= 5) System.out.println("Весна");
        else if (month >= 6 && month <= 8) System.out.println("Лето");
        else if (month >= 9 && month <= 11) System.out.println("Осень");
        else System.out.println("Такого номера месяца не существует");

        // Скидка по номеру купона
        int saleCode = 6424;
        double sum = 10000;
        switch (saleCode){
            case 4525:
                sum = sum * 0.7;
                System.out.println("Сумма покупки = " + sum);
                break;
            case 6424:
            case 7012:
                sum = sum * 0.8;
                System.out.println("Сумма покупки = " + sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum = sum * 0.9;
                System.out.println("Сумма покупки = " + sum);
            default:
                System.out.println("Сумма покупки = " + sum);
        }

        // Оценка за верные ответы
        int count = 101;
        if (count <= 100 && count >= 90) System.out.println("Отлично");
        else if (count <= 89 && count >= 60) System.out.println("Хорошо");
        else if (count <= 59 && count >= 40) System.out.println("Удовлетворительно");
        else if (count <= 39 && count >= 0) System.out.println("Попробуйте в следующий раз");
        else System.out.println("Ошибка количества ответов");

        // Попадание рандомного числа в интервал
        int rand = (int) (Math.random() * (501 - 10) + 10);
        if (rand > 25 && rand < 200) System.out.println("Число " + rand + " входит в интервал");
        else System.out.println("Число " + rand + " не входит в интервал");

        // Возраст и опыт
        int age = 25;
        int exp = 5;
        if (age > 100) {
            System.out.println("Мы вам перезвоним");
        } else {
            if (exp < 5) {
                System.out.println("Вы подходите на должность стажёра");
            } else {
                System.out.println("Вы подходите на должность разработчика");
            }
        }

    }
}
