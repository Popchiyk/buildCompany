package ua.solvd.buildCompany;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class Garage extends Building {

    private static final Logger LOGGER = LogManager.getLogger(Garage.class.getName());

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
    public int calculatePrice() {
        int price = 0;
        if (size > 20 && stairs > 1 && amountOfSpace > 2 && haveCharging) {
            price += 300;
            LOGGER.info("Price " + price);
        } else if (size < 20 && stairs < 2 && amountOfSpace < 2 && !haveCharging) {
            price += 300;
            LOGGER.info("Price " + price);
        }
        return price;
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
