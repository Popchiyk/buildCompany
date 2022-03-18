package com.company;

public class House extends Build {
    private int quantityRoom;
    private int stairs;

    public House() {
    }

    public House(String name, String nameOwner, String address, int size, int quantityRoom, int stairs) {
        super(name, nameOwner, address, size);
        this.quantityRoom = quantityRoom;
        this.stairs = stairs;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }

    public void setQuantityRoom(int quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    public int getStairs() {
        return stairs;
    }

    public void setStairs(int stairs) {
        this.stairs = stairs;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", address='" + address + '\'' +
                ", size=" + size +
                ", quantityRoom=" + quantityRoom +
                ", stairs=" + stairs +
                '}';
    }
}
