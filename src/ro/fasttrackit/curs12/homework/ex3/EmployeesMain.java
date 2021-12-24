package ro.fasttrackit.curs12.homework.ex3;

import java.util.List;

public class EmployeesMain {
    public static void main(String[] args) {
        Employees employees = new Employees(List.of(
                new Employee("Alex",36,"black","HP",5500),
                new Employee("Cristi",41,"grey","Canon",7000),
                new Employee("Maria",30,"brown","Apple",6500),
                new Employee("Ioana",25,"black","LG",4500),
                new Employee("Alin",45,"blond","LG",6000)
        ));

        System.out.println(employees.getBigSalary());
        System.out.println(employees.mapPersonToCo());
        System.out.println(employees.getSalarySum());
        System.out.println(employees.getCompanyBiggestSalary());

    }
}
