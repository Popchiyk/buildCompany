package com.company;

public class Provider extends Human {

    private String nameCompany = "Ukrainian Team";

    public Provider() {
    }

    public Provider(String firstName, String lastName, String country, int age, String nameCompany) {
        super(firstName, lastName, country, age);
        this.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", nameProvider='" + nameCompany + '\'' +
                '}';
    }
}
