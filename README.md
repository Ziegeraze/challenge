# Pizza Ordering App

This is a REST API for a pizza ordering system. It allows users to order pizzas with their choice of toppings, and view their order history. It also allows store managers to manage the inventory of toppings.

## Design Principles

This project follows several design principles:

- Single Responsibility Principle: Each class has one responsibility.
- Open-Closed Principle: New types of pizzas or toppings can be added without changing the existing code.
- Liskov Substitution Principle: A `StoreManager` is a type of `User` and can be used wherever a `User` is expected.
- Interface Segregation Principle: Regular users and store managers have different interfaces for their specific needs.
- Dependency Inversion Principle: High-level modules do not depend directly on low-level modules. Both depend on abstractions.
- RESTful Design Principles: The API is stateless, supports client-server communication, provides cacheable data, and has a uniform interface.
- Concurrency Control: The application can handle multiple users ordering pizzas at the same time against the limited inventory.
- Test-Driven Development: Tests are written before the actual code.
- Documentation: All classes and methods are properly documented.

## Algorithm

The algorithm for ordering a pizza is as follows:

1. The user selects a base, cheese, sauce, and toppings for their pizza.
2. The user adds the pizza to their cart.
3. The user checks out their cart, which adds the pizzas in the cart to their order history and clears the cart.

## Usage

To order a pizza:
POST /pizzas { "base": "Regular", "cheese": "Mozzarella", "sauce": "Tomato", "toppings": ["Mushrooms", "Olives"] }

To view the current inventory:
GET /inventory

To add a topping to the inventory:
POST /inventory { "topping": "Peppers" }

# Testing

To run the tests, use the following command:

mvn test