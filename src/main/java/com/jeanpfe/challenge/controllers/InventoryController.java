package com.jeanpfe.challenge.controllers;

import com.jeanpfe.challenge.models.Inventory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private Inventory inventory = new Inventory();

    @GetMapping
    public synchronized Inventory getInventory() {
        return inventory;
    }

    @PostMapping
    public synchronized void addTopping(@RequestBody String topping) {
        inventory.addTopping(topping);
    }

    // other endpoints omitted for brevity
}