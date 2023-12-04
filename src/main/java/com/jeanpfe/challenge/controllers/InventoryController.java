package com.jeanpfe.challenge.controllers;

import com.jeanpfe.challenge.models.Inventory;
import com.jeanpfe.challenge.models.Topping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class for managing the inventory of toppings.
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private Inventory inventory = new Inventory();

    /**
     * Retrieves the current inventory.
     *
     * @return The inventory object.
     */
    @GetMapping
    public synchronized Inventory getInventory() {
        return inventory;
    }

    /**
     * Adds a new topping to the inventory.
     *
     * @param newTopping The new topping to be added.
     * @return The response entity indicating the success of the operation.
     */
    @PostMapping
    public synchronized ResponseEntity<Void> addTopping(@RequestBody Topping newTopping) {
        inventory.addTopping(newTopping);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * Updates an existing topping in the inventory.
     *
     * @param topping     The name of the topping to be updated.
     * @param newTopping  The updated topping object.
     */
    @PutMapping("/{topping}")
    public synchronized void updateTopping(@PathVariable String topping, @RequestBody Topping newTopping) {
        inventory.updateTopping(topping, newTopping);
    }

    /**
     * Removes a topping from the inventory.
     *
     * @param topping The name of the topping to be removed.
     */
    @DeleteMapping("/{topping}")
    public synchronized void removeTopping(@PathVariable String topping) {
        inventory.removeTopping(topping);
    }
}