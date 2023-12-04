package com.jeanpfe.challenge.models;

import java.util.List;

public class StoreManager extends User {
    private Inventory inventory;

    public StoreManager(String name, Inventory inventory) {
        super(name);
        this.inventory = inventory;
    }

    public void addTopping(String topping) {
        this.inventory.addTopping(topping);
    }

    public void removeTopping(String topping) {
        this.inventory.removeTopping(topping);
    }

    public List<String> viewInventory() {
        return this.inventory.getAvailableToppings();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}