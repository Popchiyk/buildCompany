package com.company;

//Бензопила
public final class Chainsaw extends Instrument implements IInstrument {

    final int power = 300;
    private int weight;
    private int tireSize;
    private int price;
    private int quantity;

    public Chainsaw() {
    }

    public Chainsaw(String name, String development, int weight, int tireLength, int price, int quantity) {
        super(name, development);
        this.weight = weight;
        this.tireSize = tireLength;
        this.price = price;
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must not be 0");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void getPriceInstrument() {
        if (this.getWeight() > 100 && this.getTireSize() > 50) {
            this.price += 500;
        } else if (this.getWeight() > 80 && this.getTireSize() > 40) {
            this.price += 250;
        } else if (this.getWeight() > 50 && this.getTireSize() > 20) {
            this.price += 150;
        }
        this.price *= this.quantity;
    }

    @Override
    public String toString() {
        return "Chainsaw{" +
                "power=" + power +
                ", weight=" + weight +
                ", tireLength=" + tireSize +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
