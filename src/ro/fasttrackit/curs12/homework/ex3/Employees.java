package ro.fasttrackit.curs12.homework.ex3;

import java.util.*;

public class Employees {

    private final List<Employee> employees;

    public Employees(List<Employee> employees) {
        this.employees = employees == null
                ? new ArrayList<>()
                : new ArrayList<>(employees);
    }

    public List<Employee> getBigSalary() {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > 6000) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> mapPersonToCo() {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            List<Employee> employees = result.get(employee.getCompany());
            if (employees == null) {
                employees = new ArrayList<>();
                result.put(employee.getCompany(), employees);
            }
            employees.add(employee);
        }
        return result;
    }

    public Integer getSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String getCompanyBiggestSalary(){
        Employee biggestSalary = employees.get(0);
        for (Employee employee : employees){
            if(employee.getSalary() > biggestSalary.getSalary()){
                biggestSalary = employee;
                return biggestSalary.getCompany();
            }
        }
        return null;
    }
}
