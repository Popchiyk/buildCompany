package ua.solvd.buildCompany;

import ua.solvd.buildCompany.enums.Education;
import ua.solvd.buildCompany.interfaces.IWorker;

import java.time.LocalDate;

public final class Engineer extends Employee implements IWorker {

    private int workExperience;
    private Education education;

    public Engineer() {
    }

    public Engineer(String firstName, String lastName, String country, int age, LocalDate acceptOnWork,
                    String numberPassport, int salary, int workExperience, Education education) {
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
        if (workExperience > 3 && education.equals("Higher")) {
            salary = 500;
        } else if (workExperience > 2 && education.equals("Secondary")) {
            salary = 250;
        }
        return salary;
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
