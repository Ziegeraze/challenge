package com.jeanpfe.challenge.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String base;
    private String cheese;
    private String sauce;
    private List<String> toppings;
    private double price;

    public Pizza() {
        this.base = "Regular";
        this.cheese = "Mozzarella";
        this.sauce = "Tomato";
        this.toppings = new ArrayList<>();
        this.price = 10.0; // base price
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
        this.price += 2.0; // each topping costs an additional $2.0
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}