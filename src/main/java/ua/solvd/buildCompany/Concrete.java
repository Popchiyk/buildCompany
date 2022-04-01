package ua.solvd.buildCompany;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ua.solvd.buildCompany.Exсeption.PriceNotMustBeNullException;
import ua.solvd.buildCompany.interfaces.IMaterial;

// Бітон
public final class Concrete extends Material implements IMaterial {

    private static final Logger LOGGER = LogManager.getLogger(Concrete.class.getName());

    private int weight; //вага
    private int size; //розмір
    private int quantity;
    private int price;

    public Concrete() {
    }

    public Concrete(String name, String developer, int price, int weight, int size, int quantity) {
        super(name, developer);
        this.weight = weight;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
                throw new PriceNotMustBeNullException();
            } catch (PriceNotMustBeNullException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getPriceMaterial() {
        if (weight > 400 && size > 50) {
            price += 400;
        } else if (weight > 300 && size > 30) {
            price += 250;
        } else if (weight > 100 && size > 20) {
            price += 150;
        }
        return quantity > 0 ? price *= quantity : 0;
    }

    @Override
    public String toString() {
        return "Concrete{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
