package controllers;

import com.jeanpfe.challenge.controllers.PizzaController;
import com.jeanpfe.challenge.models.Pizza;
import com.jeanpfe.challenge.services.OrderPizzaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PizzaControllerTest {
    
    @Mock
    private OrderPizzaService orderPizzaService;

    private PizzaController pizzaController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        pizzaController = new PizzaController();
    }

    @Test
    void testOrderPizza_Success() {
        // Arrange
        List<String> toppings = Arrays.asList("pepperoni", "mushrooms");
        Pizza pizza = new Pizza();

        when(orderPizzaService.orderPizza(toppings)).thenReturn(pizza);

        // Act
        ResponseEntity<Pizza> response = pizzaController.orderPizza(toppings);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(pizza, response.getBody());
        verify(orderPizzaService, times(1)).orderPizza(toppings);
    }

    @Test
    void testOrderPizza_Failure() {
        // Arrange
        List<String> toppings = Arrays.asList("pepperoni", "mushrooms");

        when(orderPizzaService.orderPizza(toppings)).thenReturn(null);

        // Act
        ResponseEntity<Pizza> response = pizzaController.orderPizza(toppings);

        // Assert
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        verify(orderPizzaService, times(1)).orderPizza(toppings);
    }
}