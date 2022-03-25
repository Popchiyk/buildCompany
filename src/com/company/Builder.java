package com.company;

import com.company.interfaces.IWorker;

import java.time.LocalDate;

public final class Builder extends Employee implements IWorker {

    private int workExperience;
    private String education;

    public Builder() {
    }

    public Builder(String firstName, String lastName, String country, byte age, LocalDate acceptOnWork,
                   String numberPassport, int workExperience, String education, int salary) {
        super(firstName, lastName, country, age, acceptOnWork, numberPassport, salary);
        this.workExperience = workExperience;
        this.education = education;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public int getCalculateSalary() {
        if (this.getWorkExperience() > 3 && this.getEducation().equals("Higher")) {
            this.setSalary(500);
        } else if (this.getWorkExperience() > 2 && this.getEducation().equals("Secondary")) {
            this.setSalary(250);
        }
        return this.salary;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "workExperience=" + workExperience +
                ", education='" + education + '\'' +
                ", age=" + age +
                ", acceptOnWork=" + acceptOnWork +
                ", numberPassport='" + numberPassport + '\'' +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
