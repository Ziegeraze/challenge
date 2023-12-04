package com.jeanpfe.challenge.controllers;

import com.jeanpfe.challenge.models.Pizza;
import com.jeanpfe.challenge.services.OrderPizzaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for handling pizza-related requests.
 */
@RestController
@RequestMapping("/pizza")
public class PizzaController {
    
    @Autowired
    OrderPizzaService orderPizzaService;

    /**
     * Endpoint for ordering a pizza with the given toppings.
     * 
     * @param toppings The list of toppings for the pizza.
     * @return The response entity containing the ordered pizza or an error status.
     */
    @PostMapping
    public synchronized ResponseEntity<Pizza> orderPizza(@RequestBody List<String> toppings) {
        Pizza pizza = orderPizzaService.orderPizza(toppings);
        if (pizza != null) {
            return new ResponseEntity<>(pizza, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}