package ru.tsvetkov.homeworke.hw14.task2;

import java.util.Comparator;
import java.util.List;



public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);

        System.out.println(employeeList);
        // TODO 1: отсортировать список по имени
        Comparator<Employee> comparator1 = new NameComparator();
        employeeList.sort(comparator1);
        System.out.println(employeeList);
        // TODO 2: отсортировать список по имени и зп
        Comparator<Employee> comparator2 = new NameComparator().thenComparing(new SalaryComparator());
        employeeList.sort(comparator2);
        System.out.println(employeeList);
        // TODO 3: отсортировать список по имени, зарплате, возрасту и компании
        Comparator<Employee> comparator3 = new NameComparator().thenComparing(new SalaryComparator().thenComparing(new AgeComparator().thenComparing(new CompanyComparator())));
        employeeList.sort(comparator3);
        System.out.println(employeeList);
    }
}
