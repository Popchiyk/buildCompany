package ua.solvd.buildCompany;


import org.apache.commons.lang3.StringUtils;
import ua.solvd.buildCompany.enums.Education;
import ua.solvd.buildCompany.interfaces.IWorker;

import java.time.LocalDate;

public final class Architect extends Employee implements IWorker {

    private int workExperience;
    private Education education;

    public Architect() {
    }

    public Architect(String firstName, String lastName, String country, int age, LocalDate acceptOnWork,
                     String numberPassport, int workExperience, Education education, int salary) {
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

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public int getCalculateSalary() {
        if (workExperience > 3 && StringUtils.equals(education.getValue(),Education.HIGHER.getValue())) {
            salary = 500;
        } else if (workExperience > 2 && StringUtils.equals(education.getValue(),Education.SECONDARY.getValue())) {
            salary = 250;
        }
        return salary;
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
