package com.company;

public class Garage extends Build {
    private int amountOfSpace;
    private String door;
    private boolean haveCharging;

    public Garage() {
    }

    public Garage(String name, String nameOwner, String address, int size, int amountOfSpace, String door,
                  boolean haveCharging) {
        super(name, nameOwner, address, size);
        this.amountOfSpace = amountOfSpace;
        this.door = door;
        this.haveCharging = haveCharging;
    }

    public int getAmountOfSpace() {
        return amountOfSpace;
    }

    public void setAmountOfSpace(int amountOfSpace) {
        this.amountOfSpace = amountOfSpace;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public boolean isHaveCharging() {
        return haveCharging;
    }

    public void setHaveCharging(boolean haveCharging) {
        this.haveCharging = haveCharging;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", address='" + address + '\'' +
                ", size=" + size +
                ", amountOfSpace=" + amountOfSpace +
                ", door='" + door + '\'' +
                ", haveCharging=" + haveCharging +
                '}';
    }
}
