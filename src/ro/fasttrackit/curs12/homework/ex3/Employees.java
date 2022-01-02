package ro.fasttrackit.curs12.homework.ex3;

import java.util.*;

public class Employees {

    private final List<Employee> employees;

    int salaryAmount = 6000;

    public Employees(List<Employee> employees) {
        this.employees = employees == null
                ? new ArrayList<>()
                : new ArrayList<>(employees);
    }

    public List<Employee> getBigSalary() {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > salaryAmount) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> mapPersonToCo() {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            List<Employee> companyEmployees = result.get(employee.getCompany());
            if (companyEmployees == null) {
                companyEmployees = new ArrayList<>();
                result.put(employee.getCompany(), companyEmployees);
            }
            companyEmployees.add(employee);
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

    public String getEmployeeBiggestSalary(){
        Employee employeeMoreMoney = employees.get(0);
        for (Employee employee : employees){
            if(employee.getSalary() > employeeMoreMoney.getSalary()){
                employeeMoreMoney = employee;
                return employeeMoreMoney.getName();
            }
        }
        return null;
    }
}
