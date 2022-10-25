package ru.tsvetkov.homeworke.hw14.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return -(o1.getSalary() - o2.getSalary());
    }
}
class AgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
class CompanyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}
public class Employee implements Comparable<Employee>{
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить конструктор, необходимы геттеры и сеттеры


    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке
    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        // создание объектов, наполнение списка
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int) (Math.random() * 11)], companies[(int) (Math.random() * 7)], (int) (Math.random() * (10 -1) + 1), (int) (Math.random()* (60-21) + 21)));
        }
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (age != employee.age) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + age;
        return result;
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}
