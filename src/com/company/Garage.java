package com.company;

public class Garage extends Building {
    private int amountOfSpace;
    private boolean haveCharging;

    public Garage() {
    }

    public Garage(int size, int stairs, String color, int amountOfEntrance, int amountOfSpace, boolean haveCharging) {
        super(size, stairs, color, amountOfEntrance);
        this.amountOfSpace = amountOfSpace;
        this.haveCharging = haveCharging;
    }

    public int getAmountOfSpace() {
        return amountOfSpace;
    }

    public void setAmountOfSpace(int amountOfSpace) {
        this.amountOfSpace = amountOfSpace;
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
                "size=" + size +
                ", stairs=" + stairs +
                ", color='" + color + '\'' +
                ", amountOfEntrance=" + amountOfEntrance +
                ", amountOfSpace=" + amountOfSpace +
                ", haveCharging=" + haveCharging +
                '}';
    }
}
