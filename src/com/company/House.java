package com.company;

public final class House extends Building {

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
    public void calculatePrice() {
        if (size > 20 && stairs > 1 && quantityRoom > 3) {
            System.out.println("Price is" + 300);
        } else if (size < 20 && stairs < 2 && quantityRoom < 2) {
            System.out.println("Price is" + 150);
        }
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
