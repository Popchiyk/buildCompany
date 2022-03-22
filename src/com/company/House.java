package com.company;

public class House extends Building {
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
    public String toString() {
        return "House{" +
                "size=" + size +
                ", stairs=" + stairs +
                ", color='" + color + '\'' +
                ", quantityRoom=" + quantityRoom +
                '}';
    }
}
