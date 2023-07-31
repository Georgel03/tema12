package org.fasttrackit.tema12;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{

    private String company;

    private double salary;

    public Employee(String name, int age, String hairColour, String company, double salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;

    }

    public String getCompany() {
        return this.company;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {

        return name + " " + age + " " + company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
