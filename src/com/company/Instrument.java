package com.company;

public abstract class Instrument{
    protected String name;
    protected String development;

    public Instrument() {
    }

    public Instrument(String name, String development) {
        this.name = name;
        this.development = development;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String  development) {
        this.development = development;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + development +
                '}';
    }
}
