package ua.solvd.buildCompany;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class House extends Building {

    private static final Logger LOGGER = LogManager.getLogger(House.class.getName());

    private int quantityRoom;

    public House() {
    }

    public House(int size, int stairs, String color, int quantityRoom) {
        super(size, stairs, color);
        this.quantityRoom = quantityRoom;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }

    public void setQuantityRoom(int quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    @Override
    public int calculatePrice() {
        int price = 0;
        if (size > 20 && stairs > 1 && quantityRoom > 3) {
            price += 300;
            LOGGER.info("Price " + price);
        } else if (size < 20 && stairs < 2 && quantityRoom < 2) {
            price += 150;
            LOGGER.info("Price " + price);
        }
        return price;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", stairs=" + stairs +
                ", color='" + color + '\'' +
                ", quantityRoom=" + quantityRoom +
                '}';
    }
}
