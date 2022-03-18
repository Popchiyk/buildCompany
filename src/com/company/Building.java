package com.company;

public class Building {
    protected int size;
    protected int stairs;
    protected String color;
    protected int amountOfEntrance;

    public Building() {
    }

    public Building(int size, int stairs, String color, int amountOfEntrance) {
        this.size = size;
        this.stairs = stairs;
        this.color = color;
        this.amountOfEntrance = amountOfEntrance;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStairs() {
        return stairs;
    }

    public void setStairs(int stairs) {
        this.stairs = stairs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountOfEntrance() {
        return amountOfEntrance;
    }

    public void setAmountOfEntrance(int amountOfEntrance) {
        this.amountOfEntrance = amountOfEntrance;
    }

    @Override
    public String toString() {
        return "Building{" +
                "size=" + size +
                ", stairs=" + stairs +
                ", stairs=" + amountOfEntrance +
                ", color='" + color + '\'' +
                '}';
    }
}
