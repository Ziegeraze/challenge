package controllers;

import com.jeanpfe.challenge.controllers.InventoryController;
import com.jeanpfe.challenge.models.Inventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InventoryControllerTest {
    
    @InjectMocks
    InventoryController inventoryController;

    @Mock
    Inventory inventory;

    @BeforeEach
    public void init() {
        
    }

    @Test
    public void testGetInventory() {
        inventoryController.getInventory();
        verify(inventory, times(1)).getAvailableToppings();
    }

    @Test
    public void testAddTopping() {
        String topping = "Mushrooms";
        inventoryController.addTopping(topping);
        verify(inventory, times(1)).addTopping(topping);
    }

}