package com.company;
//Бензопила
public class Chainsaw extends Instrument{
    private int power;
    private int weight;
    private int tireLength;
    private int price;
    private int quantity;

    public Chainsaw() {
    }

    public Chainsaw(String name, String development, int power, int weight, int tireLength, int price, int quantity) {
        super(name, development);
        this.power = power;
        this.weight = weight;
        this.tireLength = tireLength;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTireLength() {
        return tireLength;
    }

    public void setTireLength(int tireLength) {
        this.tireLength = tireLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFullPriceInstrument(){
        if(this.getPower() > 400 && this.getWeight() > 100 && this.getTireLength() > 50){
            this.price += 500;
        }
        else if(this.getPower() > 300 && this.getWeight() > 80 && this.getTireLength() > 40){
            this.price += 250;
        }
        else if(this.getPower() > 200 && this.getWeight() > 50 && this.getTireLength() > 20){
            this.price += 150;
        }
        return this.getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Chainsaw{" +
                "power=" + power +
                ", weight=" + weight +
                ", tireLength=" + tireLength +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
