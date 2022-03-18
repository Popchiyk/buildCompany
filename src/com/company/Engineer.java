package com.company;

import java.time.LocalDate;

public class Engineer extends Employee {
    private int workExperience;
    private String education;

    public Engineer() {
    }

    public Engineer(String firstName, String lastName, String country, byte age, LocalDate acceptOnWork,
                    String numberPassport, int workExperience, String education, int salary) {
        super(firstName, lastName, country, age, acceptOnWork, numberPassport,salary);
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

    public void calculationSalaryEngineer(){
        if(this.getWorkExperience() > 3 && this.getEducation().equals("Higher")){
            this.setSalary(500);
        }
        else if(this.getWorkExperience() > 2 && this.getEducation().equals("Secondary")){
            this.setSalary(250);
        }
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "age=" + age +
                ", acceptOnWork=" + acceptOnWork +
                ", numberPassport='" + numberPassport + '\'' +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                ", education='" + education + '\'' +
                '}';
    }
}
