package ua.solvd.buildCompany;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ua.solvd.buildCompany.Exсeption.SalaryNotMustBeNullException;
import ua.solvd.buildCompany.interfaces.IInstrument;

// Шуруповерт
public final class Screwdriver extends Instrument implements IInstrument {

    private static final Logger LOGGER = LogManager.getLogger(Screwdriver.class.getName());

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
            LOGGER.error("Price not must be 0");
            try {
                throw new SalaryNotMustBeNullException();
            } catch (SalaryNotMustBeNullException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getPriceInstrument() {
        if (torque > 100 && turnover > 50) {
            price += 500;
        } else if (torque > 70 && turnover > 40) {
            price += 250;
        } else if (torque > 50 && turnover > 40) {
            price += 150;
        }
        return quantity > 0 ? price *= quantity : 0;
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
