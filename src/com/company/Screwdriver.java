package com.company;
// Шуруповерт
public class Screwdriver extends Instrument {
    private int voltage;
    private int torque;//обертаючий момент
    private int turnover;//оборот
    private int quantity;
    private int price;

    public Screwdriver() {
    }

    public Screwdriver(String name, int quantity, String development, int voltage, int torque, int turnover, int price) {
        super(name, development);
        this.voltage = voltage;
        this.torque = torque;
        this.turnover = turnover;
        this.quantity = quantity;
        this.price = price;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFullPriceInstrument(){
        if(this.getVoltage() > 400 && this.getTorque() > 100 && this.getTurnover() > 50){
            this.price += 500;
        }
        else if(this.getVoltage() > 250 && this.getTorque() > 70 && this.getTurnover() > 40){
            this.price += 250;
        }
        else if(this.getVoltage() > 200 && this.getTorque() > 50 && this.getTurnover() > 40){
            this.price += 150;
        }
        return this.getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Screwdriver{" +
                "name='" + name + '\'' +
                ", development='" + development + '\'' +
                ", voltage=" + voltage +
                ", torque=" + torque +
                ", turnover=" + turnover +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
