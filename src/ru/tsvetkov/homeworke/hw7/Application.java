package ru.tsvetkov.homeworke.hw7;

import ru.tsvetkov.homeworke.hw7.unit.Director;
import ru.tsvetkov.homeworke.hw7.unit.School;
import ru.tsvetkov.homeworke.hw7.unit.Student;
import ru.tsvetkov.homeworke.hw7.unit.Teacher;

public class Application {
    public static void main(String[] args) {
        // создание директора
        Director director = new Director("Борис Сергеевич",44);

        // создание школы
        School school = new School("292", director, 5, 10);

        // создание учителей
        Teacher teacher1 = new Teacher("Евгений Петрович", 30, "История", 3);
        Teacher teacher2 = new Teacher("Андрей Михайлович", 25, "Физкультура", 2);
        Teacher teacher3 = new Teacher("Клавдия Владимировна", 36, "Язык", 5);
        Teacher teacher4 = new Teacher("Наталья Николоаевна", 44, "Обществознание", 5);
        Teacher teacher5 = new Teacher("Александр Наумович", 60, "Физика", 7);

        // заполнение учителей
        school.addTeachers(teacher1);
        school.addTeachers(teacher2);
        school.addTeachers(teacher3);
        school.addTeachers(teacher4);
        school.addTeachers(teacher5);

        //заполнение студентов
        school.getStudents();

        // просмотр школы
        System.out.println(school.toString());

        //учебный день
        school.schoolDay();








    }
}
