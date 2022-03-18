package com.company;

abstract public class Material{
    public String name;
    public String developer;

    public Material() {
    }

    public Material(String name, String developer) {
        this.name = name;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
