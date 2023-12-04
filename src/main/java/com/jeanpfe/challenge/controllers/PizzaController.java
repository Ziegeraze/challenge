package com.jeanpfe.challenge.controllers;

import com.jeanpfe.challenge.models.Pizza;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {
    private List<Pizza> pizzas = new ArrayList<>();

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzas;
    }

    @PostMapping
    public void orderPizza(@RequestBody Pizza pizza) {
        pizzas.add(pizza);
    }

    @GetMapping("/{id}")
    public Pizza getPizzaById(@PathVariable int id) {
        // Logic to retrieve pizza by ID from the list or database
        // Replace this with your actual implementation
        return pizzas.get(id);
    }
}