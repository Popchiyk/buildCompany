package com.company;

public abstract class Material {
    protected String name;
    protected String developer;

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
