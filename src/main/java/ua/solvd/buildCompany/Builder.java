package ua.solvd.buildCompany;

import ua.solvd.buildCompany.interfaces.IWorker;

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
        if (workExperience > 3 && education.equals("Higher")) {
            salary = 500;
        } else if (workExperience > 2 && education.equals("Secondary")) {
            salary = 250;
        }
        return salary;
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
