package com.jeanpfe.challenge.models;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> availableToppings;
    private List<String> availableBases;
    private List<String> availableCheeses;
    private List<String> availableSauces;

    public Inventory() {
        this.availableToppings = new ArrayList<>();
        this.availableBases = new ArrayList<>();
        this.availableCheeses = new ArrayList<>();
        this.availableSauces = new ArrayList<>();
    }

    public void addTopping(String topping) {
        this.availableToppings.add(topping);
    }

    public void removeTopping(String topping) {
        this.availableToppings.remove(topping);
    }
    public void addBase(String base) {
        this.availableBases.add(base);
    }

    public void removeBase(String base) {
        this.availableBases.remove(base);
    }

    public void addCheese(String cheese) {
        this.availableCheeses.add(cheese);
    }

    public void removeCheese(String cheese) {
        this.availableCheeses.remove(cheese);
    }

    public void addSauce(String sauce) {
        this.availableSauces.add(sauce);
    }

    public void removeSauce(String sauce) {
        this.availableSauces.remove(sauce);
    }

    // getters and setters for availableToppings
    public List<String> getAvailableToppings() {
        return availableToppings;
    }

    public void setAvailableToppings(List<String> availableToppings) {
        this.availableToppings = availableToppings;
    }

    // getters and setters for availableBases
    public List<String> getAvailableBases() {
        return availableBases;
    }

    public void setAvailableBases(List<String> availableBases) {
        this.availableBases = availableBases;
    }

    // getters and setters for availableCheeses
    public List<String> getAvailableCheeses() {
        return availableCheeses;
    }

    public void setAvailableCheeses(List<String> availableCheeses) {
        this.availableCheeses = availableCheeses;
    }

    // getters and setters for availableSauces
    public List<String> getAvailableSauces() {
        return availableSauces;
    }

    public void setAvailableSauces(List<String> availableSauces) {
        this.availableSauces = availableSauces;
    }
}
