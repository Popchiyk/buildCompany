package com.company;

public class Brick extends Material{
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
        this.price = price;
    }

    public int getFullPriceMaterial(){
        if(this.getWeight() > 350 && this.getSize() > 50){
            this.price += 400;
        }
        else if(this.getWeight() > 300 && this.getSize() > 30){
            this.price += 250;
        }
        else if(this.getWeight() > 100 && this.getSize() > 20){
            this.price += 150;
        }
        return this.getPrice() * this.getQuantity();
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
