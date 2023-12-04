package com.jeanpfe.challenge.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanpfe.challenge.models.Inventory;
import com.jeanpfe.challenge.models.Pizza;
import com.jeanpfe.challenge.models.Topping;

/**
 * This class represents a service for ordering pizza.
 */
@Service
public class OrderPizzaService {
    @Autowired
    Inventory inventory;

    /**
     * Orders a pizza with the given toppings.
     * 
     * @param toppings the list of toppings for the pizza
     * @return the ordered pizza
     */
    public Pizza orderPizza(List<String> toppings) {
        Pizza pizza = new Pizza();

        List<Topping> availableToppings = inventory.getAvailableToppings();
        List<Topping> pizzaToppings = new ArrayList<>();

        for (String topping : toppings) {
            for (Topping availableTopping : availableToppings) {
                if (availableTopping.getName().equals(topping)) {
                    pizzaToppings.add(availableTopping);
                    pizza.setPrice(pizza.getPrice() + availableTopping.getPrice());
                }
            }
        }
        
        pizza.setToppings(pizzaToppings);

        System.out.println(pizza.toString());
        return pizza;
    }
    
}
