package ru.tsvetkov.homeworke.hw7.unit;

import java.util.Arrays;

public class School {
    private String nameSchool;
    private Director director;
    private Teacher[] teachers;
    private Student[] students;

    public School(String nameSchool, Director director, int countTeachers, int countStudents) {
        setNameSchool(nameSchool);
        this.director = director;
        teachers = new Teacher[countTeachers];
        students = new Student[countStudents];

    }

    public void setNameSchool(String nameSchool) {
        if (nameSchool.length()<3){
            throw new IllegalArgumentException("Имя школы не может быть меньше 3 символов");
        }
        this.nameSchool = nameSchool;
    }
   public void addStudent(Student students){
       for (int i = 0; i < this.students.length; i++) {
           if (this.students[i] == null){
               this.students[i] = students;
               System.out.println("Сутдент "+ students.getName()+ " добавлен");
               return;
           }
           System.out.println("Класс укомплектован");
       }
   }
   public void addTeachers(Teacher teachers){
       for (int i = 0; i < this.teachers.length; i++) {
           if (this.teachers[i] == null){
               this.teachers[i] = teachers;
               System.out.println("Учитель " + teachers.getName() +" добавлен");
               return;
           }
       }
   }
   public void getStudents(){
        students = Student.generClassStudentes(students.length);
   }

    public void schoolDay(){
        director.start();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) return;
            for (int j = 0; j < teachers.length; j++) {
                if (teachers[j] == null) break;
                if (students[i].getNameStudySubject().equals(teachers[j].getNameStudySubject())) {
                    students[i].teach(teachers[j]);
                }
            }
        }
        director.end();
    }

    @Override
    public String toString() {
        return "School{" +
                "nameSchool='" + nameSchool + '\'' +
                ", director=" + director +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
