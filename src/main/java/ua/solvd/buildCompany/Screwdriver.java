package ua.solvd.buildCompany;


import ua.solvd.buildCompany.interfaces.IInstrument;

// Шуруповерт
public final class Screwdriver extends Instrument implements IInstrument {
    private static int voltage = 220;
    private int torque;//обертаючий момент
    private int turnover;//оборот
    private int quantity;
    private int price;

    public Screwdriver() {
    }

    public Screwdriver(String name, int quantity, String development, int torque, int turnover, int price) {
        super(name, development);
        this.torque = torque;
        this.turnover = turnover;
        this.quantity = quantity;
        this.price = price;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        Screwdriver.voltage = voltage;
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
        if (price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Price not must be 0");
        }

    }

    @Override
    public int getPriceInstrument() {
        if (this.getTorque() > 100 && this.getTurnover() > 50) {
            this.price += 500;
        } else if (this.getTorque() > 70 && this.getTurnover() > 40) {
            this.price += 250;
        } else if (this.getTorque() > 50 && this.getTurnover() > 40) {
            this.price += 150;
        }
        return this.quantity>0 ? this.price *= this.quantity : 0;
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
