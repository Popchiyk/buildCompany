package com.company;

import java.time.LocalDate;

public abstract class Employee extends Human{
    public byte age;
    public LocalDate acceptOnWork;
    public String numberPassport;
    public int salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String country, byte age,
                    LocalDate acceptOnWork, String numberPassport, int salary) {
        super(firstName, lastName, country);
        this.age = age;
        this.acceptOnWork = acceptOnWork;
        this.numberPassport = numberPassport;
        this.salary = salary;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
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
        this.salary = salary;
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
