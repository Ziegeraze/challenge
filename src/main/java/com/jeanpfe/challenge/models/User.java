package com.jeanpfe.challenge.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Pizza> cart;
    private List<Pizza> orderHistory;

    public User(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
        this.orderHistory = new ArrayList<>();
    }

    public void orderPizza(Pizza pizza) {
        this.cart.add(pizza);
    }

    public void checkout() {
        this.orderHistory.addAll(cart);
        this.cart.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pizza> getCart() {
        return cart;
    }

    public void setCart(List<Pizza> cart) {
        this.cart = cart;
    }

    public List<Pizza> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Pizza> orderHistory) {
        this.orderHistory = orderHistory;
    }
}