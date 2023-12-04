package com.jeanpfe.challenge.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * Represents a pizza.
 */
@Component
public class Pizza {
    private String base;
    private String cheese;
    private String sauce;
    private List<Topping> toppings;
    private double price;

    /**
     * Constructs a new Pizza object with default values.
     * The default values are:
     * - Base: Regular
     * - Cheese: Mozzarella
     * - Sauce: Tomato
     * - Toppings: Empty list
     * - Price: 3.0
     */
    public Pizza() {
        this.base = "Regular";
        this.cheese = "Mozzarella";
        this.sauce = "Tomato";
        this.toppings = new ArrayList<>();
        this.price = 3.0; // base price
    }

    /**
     * Gets the price of the pizza.
     *
     * @return The price of the pizza.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the base of the pizza.
     *
     * @return The base of the pizza.
     */
    public String getBase() {
        return base;
    }

    /**
     * Gets the cheese of the pizza.
     *
     * @return The cheese of the pizza.
     */
    public String getCheese() {
        return cheese;
    }

    /**
     * Gets the sauce of the pizza.
     *
     * @return The sauce of the pizza.
     */
    public String getSauce() {
        return sauce;
    }  

    /**
     * Gets the toppings of the pizza.
     *
     * @return The toppings of the pizza.
     */
    public List<Topping> getToppings() {
        return toppings;
    }

    /**
     * Sets the price of the pizza.
     *
     * @param price The price of the pizza.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Sets the toppings of the pizza.
     *
     * @param toppings The toppings of the pizza.
     */
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    /**
     * Returns a string representation of the pizza.
     *
     * @return A string representation of the pizza.
     */
    @Override
    public String toString() {
        return "Pizza [base=" + base + ", cheese=" + cheese + ", price=" + price + ", sauce=" + sauce + ", toppings="
                + toppings + "]";
    }
}