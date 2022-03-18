package com.company;

public class Build {
    protected String name;
    protected String nameOwner;
    protected String address;
    protected int size;

    public Build() {
    }

    public Build(String name, String nameOwner, String address, int size) {
        this.name = name;
        this.nameOwner = nameOwner;
        this.address = address;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
