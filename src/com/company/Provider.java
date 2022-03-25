package com.company;

public class Provider extends Human {

    private static String nameCompany = "Ukrainian Team";

    public Provider() {
    }

    public Provider(String firstName, String lastName, String country, int age, String nameCompany) {
        super(firstName, lastName, country, age);
        Provider.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        Provider.nameCompany = nameCompany;
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
