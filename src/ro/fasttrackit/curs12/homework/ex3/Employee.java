package ro.fasttrackit.curs12.homework.ex3;

import ro.fasttrackit.curs12.homework.ex2.Person;

public class Employee extends Person {

    private final String company;
    private final int salary;

    public Employee(String name, int age, String hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return super.getAge();
    }

    public String getHairColour() {
        return super.getHairColour();
    }

    public String getName() {
        return super.getName();

    }
}
