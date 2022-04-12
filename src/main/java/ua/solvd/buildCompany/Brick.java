package ua.solvd.buildCompany;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ua.solvd.buildCompany.Exсeption.PriceNotMustBeNullException;
import ua.solvd.buildCompany.interfaces.IMaterial;

//цегла
public final class Brick extends Material implements IMaterial {

    private static final Logger LOGGER = LogManager.getLogger(Brick.class.getName());

    private int weight;
    private int size;
    private int quantity;
    private int price;

    public Brick() {
    }

    public Brick(String name, String developer, int weight, int size, int quantity, int price) {
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
            try {
                throw new PriceNotMustBeNullException();
            } catch (PriceNotMustBeNullException e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());
            }
        }
    }

    @Override
    public int getPriceMaterial() {
        if (weight > 350 && size > 50) {
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
        return "Brick{" +
                "weight=" + weight +
                ", size=" + size +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
