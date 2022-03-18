package com.company;

import java.time.LocalDate;

public class Employee extends Human {
    public LocalDate acceptOnWork;
    public String numberPassport;
    public int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String country, int age,
                    LocalDate acceptOnWork, String numberPassport, int salary) {
        super(firstName, lastName, country, age);
        this.acceptOnWork = acceptOnWork;
        this.numberPassport = numberPassport;
        this.salary = salary;
    }

    public LocalDate getAcceptOnWork() {
        return acceptOnWork;
    }

    public void setAcceptOnWork(LocalDate acceptOnWork) {
        this.acceptOnWork = acceptOnWork;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must not be 0");
        }
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", acceptOnWork=" + acceptOnWork +
                ", numberPassport='" + numberPassport + '\'' +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
