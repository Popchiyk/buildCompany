package com.company;

// Бітон
public class Concrete extends Material {
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
            System.out.println("Price must not be 0");
        }
    }

    public int getFullPriceMaterialConcrete() {
        if (this.getWeight() > 400 && this.getSize() > 50) {
            this.price += 400;
        } else if (this.getWeight() > 300 && this.getSize() > 30) {
            this.price += 250;
        } else if (this.getWeight() > 100 && this.getSize() > 20) {
            this.price += 150;
        }
        return this.getPrice() * this.getQuantity();
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
