package com.company;

public final class Garage extends Building {

    private int amountOfSpace;
    private boolean haveCharging;

    public Garage() {
    }

    public Garage(int size, int stairs, String color, int amountOfSpace, boolean haveCharging) {
        super(size, stairs, color);
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
    public void calculatePrice() {
        if (size > 20 && stairs > 1 && amountOfSpace > 2 && haveCharging) {
            System.out.println("Price is" + 300);
        } else if (size < 20 && stairs < 2 && amountOfSpace < 2 && !haveCharging) {
            System.out.println("Price is" + 150);
        }
    }

    @Override
    public String toString() {
        return "Garage{" +
                "size=" + size +
                ", stairs=" + stairs +
                ", color='" + color + '\'' +
                ", amountOfSpace=" + amountOfSpace +
                ", haveCharging=" + haveCharging +
                '}';
    }
}
