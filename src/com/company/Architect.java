package com.company;

import java.time.LocalDate;

public final class Architect extends Employee implements IWorker {
    private int workExperience;
    private String education;

    public Architect() {
    }

    public Architect(String firstName, String lastName, String country, int age, LocalDate acceptOnWork,
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
    public void calculateSalary() {
        if (this.getWorkExperience() > 3 && this.getEducation().equals("Higher")) {
            this.setSalary(500);
        } else if (this.getWorkExperience() > 2 && this.getEducation().equals("Secondary")) {
            this.setSalary(250);
        }
    }


    @Override
    public String toString() {
        return "Architect{" +
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
