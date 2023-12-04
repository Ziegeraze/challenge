# Pizza Ordering App

This is a REST API for a pizza ordering system. It allows users to order pizzas with their choice of toppings and view their order history. Store managers can manage the inventory of toppings.

## Design Principles

This project adheres to several design principles:

- **Single Responsibility Principle**: Each class has one responsibility.
- **Open-Closed Principle**: The system is designed to allow the addition of new types of pizzas or toppings without modifying the existing code.
- **RESTful Design Principles**: The API is stateless, supports client-server communication, provides cacheable data, and maintains a uniform interface.
- **Concurrency Control**: The application can handle multiple users ordering pizzas simultaneously against the limited inventory.
- **Documentation**: All classes and methods are properly documented.

## Algorithm

The algorithm for ordering a pizza is as follows:

**Order Endpoint**
1. The user selects toppings for their pizza.
2. The app calculates the price and returns the pizza order details.

**Inventory Management**
1. Admin can Create, Update, List, or Delete Toppings

## Usage

To order a pizza, make a POST request to `/pizzas` with a JSON array of toppings:

```json
[
    "Pepperoni",
    "Onions"
]

## Postman Collection included