package ua.solvd.buildCompany;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ua.solvd.buildCompany.Exсeption.PriceNotMustBeNullException;
import ua.solvd.buildCompany.interfaces.IInstrument;


//Бензопила
public final class Chainsaw extends Instrument implements IInstrument {

    private static final Logger LOGGER = LogManager.getLogger(Chainsaw.class.getName());

    private final int power = 300;
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
            LOGGER.error("Salary not must be 0");
            try {
                throw new PriceNotMustBeNullException();
            } catch (PriceNotMustBeNullException e) {
                e.printStackTrace();
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getPriceInstrument() {
        if (weight > 100 && tireSize > 50) {
            price += 500;
        } else if (weight > 80 && tireSize > 40) {
            price += 250;
        } else if (weight > 50 && tireSize > 20) {
            price += 150;
        }
        return quantity > 0 ? price *= quantity : 0;
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
