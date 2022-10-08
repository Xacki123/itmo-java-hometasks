package ru.tsvetkov.homeworke.hw7.unit;

import ru.tsvetkov.homeworke.hw7.base.TeachHumen;

public class Student extends TeachHumen {

    public Student(String name, int age, String nameStudySubject,  int level){
        super(name,age,nameStudySubject,level);

    }
    public static Student generStudent() {
        String[] names = {"Алексей", "Андрей", "Эдуард", "Александр", "Даниил", "Денис"};
        String[] nameStudySubjectes = {"История", "Физкультура", "Язык", "Обществознание","Физика"};
        int randName, randSubjectes;

        randName = (int) (Math.random() * names.length);
        randSubjectes = (int) (Math.random() * nameStudySubjectes.length);

        Student student = new Student(names[randName], (int) (Math.random()*(17-7) + 7), nameStudySubjectes[randSubjectes], (int) (Math.random()*3+1));
        return student;
    }
    public static Student[] generClassStudentes(int count){
        Student[] students = new Student[count];
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = generStudent();
            }
        }
        return students;
    }
    @Override
    public void teach(TeachHumen teachHumen){
        setLevel(getLevel() + (int) (Math.random() * teachHumen.getLevel() + 1));
        System.out.println("Уровень студента "+ getName() + " По предмету " + getNameStudySubject()+ " стал "+ getLevel());
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudySubject='" + nameStudySubject + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
