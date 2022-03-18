package com.company;

public class Provider extends Human{
    private int quantity;
    private int price;
    private String nameProvider;

    public Provider() {
    }

    public Provider(String firstName, String lastName, String country, int quantity, int price, String nameProvider) {
        super(firstName, lastName, country);
        this.quantity = quantity;
        this.price = price;
        this.nameProvider = nameProvider;
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

    public String getNameProvider() {
        return nameProvider;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", nameProvider='" + nameProvider + '\'' +
                '}';
    }
}
