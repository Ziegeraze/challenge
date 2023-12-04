package com.jeanpfe.challenge.models;

/**
 * Represents a topping for a food item.
 */
public class Topping {
    private String name;
    private double price;

    /**
     * Constructs a new Topping instance with default values.
     */
    public Topping() {
    }

    /**
     * Constructs a new Topping instance with the specified name and price.
     *
     * @param name  the name of the topping
     * @param price the price of the topping
     */
    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the topping.
     *
     * @return the name of the topping
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the topping.
     *
     * @param name the name of the topping
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the topping.
     *
     * @return the price of the topping
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the topping.
     *
     * @param price the price of the topping
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the Topping object.
     *
     * @return a string representation of the Topping object
     */
    @Override
    public String toString() {
        return "Topping [name=" + name + ", price=" + price + "]";
    }
}