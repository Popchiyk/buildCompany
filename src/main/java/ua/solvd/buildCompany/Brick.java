package ua.solvd.buildCompany;


import ua.solvd.buildCompany.interfaces.IMaterial;

//цегла
public final class Brick extends Material implements IMaterial {

    private int weight;
    private int size;
    private int quantity;
    private int price;

    public Brick() {
    }

    public Brick(String name, int price, String developer, int weight, int size, int quantity) {
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
            System.out.println("Price must not be 0");
        }
    }

    @Override
    public int getPriceMaterial() {
        if (this.getWeight() > 350 && this.getSize() > 50) {
            this.price += 400;
        } else if (this.getWeight() > 300 && this.getSize() > 30) {
            this.price += 250;
        } else if (this.getWeight() > 100 && this.getSize() > 20) {
            this.price += 150;
        }
        return this.quantity>0 ? this.price *= this.quantity : 0;
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