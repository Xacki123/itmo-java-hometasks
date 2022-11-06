package ru.tsvetkov.homeworke.hw17.student;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StudentTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        Map<Student.Gender, ArrayList<Student>> mapGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.toCollection(ArrayList::new)));
        System.out.println(mapGender);
        //  2. Найти средний возраст учеников
        double age = students.stream().
                mapToInt(student -> LocalDate.now().getYear() - student.getBirth().getYear())
                .average().orElse(0);
        System.out.println(age);
        //  3. Найти самого младшего ученика
        Student studentMin = students.stream()
                .max(Comparator.comparing(student1 -> student1.getBirth().getYear()))
                .orElse(null);
        System.out.println(studentMin);
        //  4. Найти самого старшего ученика
        Student studentMax = students.stream()
                .min(Comparator.comparing(student1 -> student1.getBirth().getYear()))
                .orElse(null);
        System.out.println(studentMax);
        //  5. Собрать учеников в группы по году рождения
        Map<Integer, ArrayList<Student>> mapBirth = students.stream()
                .collect(Collectors.groupingBy(st -> st.getBirth().getYear(),
                Collectors.toCollection(ArrayList::new)));
        System.out.println(mapBirth);
        //  6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        Collection<Student> students1 = students.stream()
                .collect(Collectors.toMap(Student::getName,
                        student -> student,
                        (st1, st2) -> st1))
                .values();
        System.out.println(students1);
        //  7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        students.sort(Comparator.comparing(Student::getGender).
                thenComparing(Student::getBirth)
                .thenComparing(Student::getName)
                .reversed());
        //  8. Вывести в консоль всех учеников в возрасте от N до M лет
        int n = 12;
        int m = 18;
        students.forEach(student -> {
            if (LocalDate.now().getYear() - student.getBirth().getYear() > n && LocalDate.now().getYear() - student.getBirth().getYear()<m) {
                System.out.println(student);
            }
        });
        //  9. Собрать в список всех учеников с именем=someName
        String someName = "Alex";
        List<Student> students2 = students.stream()
                .filter(student -> student.getName().equals(someName)).toList();
        System.out.println(students2);
        //  10. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        Map<Student.Gender, Integer> map = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.summingInt(st -> LocalDate.now().getYear() - st.getBirth().getYear())));
        System.out.println(map);
    }
}
