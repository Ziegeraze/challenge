package com.jeanpfe.challenge.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import java.util.Iterator;

@Component
public class Inventory {
    private List<Topping> availableToppings;
    private List<String> availableBases;
    private List<String> availableCheeses;
    private List<String> availableSauces;

    /**
     * Constructs a new Inventory object with default available toppings, bases, cheeses, and sauces.
     */
    public Inventory() {
        this.availableToppings = new ArrayList<>(List.of(
            new Topping("Pepperoni", 1.5),
            new Topping("Mushrooms", 1.0),
            new Topping("Onions", 1.0)
        ));
        this.availableBases = new ArrayList<>(List.of("Regular"));
        this.availableCheeses = new ArrayList<>(List.of("Mozzarella"));
        this.availableSauces = new ArrayList<>(List.of("Tomato"));
    }

    /**
     * Adds a new topping to the available toppings list.
     *
     * @param topping the topping to be added
     */
    public void addTopping(Topping topping) {
        this.availableToppings.add(topping);
    }

    /**
     * Removes a topping from the available toppings list.
     *
     * @param toppingToRemove the name of the topping to be removed
     */
    public void removeTopping(String toppingToRemove) {
        Iterator<Topping> iterator = this.availableToppings.iterator();
        while (iterator.hasNext()) {
            Topping topping = iterator.next();
            if (topping.getName().equals(toppingToRemove)) {
                iterator.remove();
            }
        }
    }

    /**
     * Returns the list of available toppings.
     *
     * @return the list of available toppings
     */
    public List<Topping> getAvailableToppings() {
        return availableToppings;
    }

    /**
     * Sets the list of available toppings.
     *
     * @param availableToppings the list of available toppings to be set
     */
    public void setAvailableToppings(List<Topping> availableToppings) {
        this.availableToppings = availableToppings;
    }

    /**
     * Updates the name and price of a topping in the available toppings list.
     *
     * @param topicToDeleteName the name of the topping to be updated
     * @param newTopping the new topping object with updated name and price
     */
    public void updateTopping(String topicToDeleteName, Topping newTopping) {
        for (Topping topping : this.availableToppings) {
            if (topping.getName().equals(topicToDeleteName)) {
                topping.setName(newTopping.getName());
                topping.setPrice(newTopping.getPrice());
            }
        }
    }
}
