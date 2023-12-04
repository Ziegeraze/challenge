# Pizza Ordering App

This is a REST API for a pizza ordering system. It allows users to order pizzas with their choice of toppings, and view their order history. It also allows store managers to manage the inventory of toppings.

## Design Principles

This project follows several design principles:

- Single Responsibility Principle: Each class has one responsibility.
- Open-Closed Principle: New types of pizzas or toppings can be added without changing the existing code.
- RESTful Design Principles: The API is stateless, supports client-server communication, provides cacheable data, and has a uniform interface.
- Concurrency Control: The application can handle multiple users ordering pizzas at the same time against the limited inventory.
- Documentation: All classes and methods are properly documented.

## Algorithm

The algorithm for ordering a pizza is as follows:

Order Endpoint
1. The user toppings for their pizza.
2. The app returns the pizza and price.

Inventory Management
1. Admin can Create, Update, List or Delete Toppings

## Usage

To order a pizza:
POST /pizzas 

[
    "Pepperoni",
    "Onions"
]

To view the current inventory:
GET /inventory

Response 200

{
    "availableToppings": [
        {
            "name": "Pepperoni",
            "price": 1.5
        },
        {
            "name": "Mushrooms",
            "price": 1.0
        },
        {
            "name": "Onions",
            "price": 1.0
        }
    ]
}

To add a topping to the inventory:
POST /inventory

Body 
{
    "name": "Peppers",
    "price": 1.5
}

Response
HTTP Code 201

=====================================
To update a topping in the inventory:
PUT /inventory/{currentToppingName}

New Data:
{
    "name": "Green Onions",
    "price": 3.0
}

Response
HTTP Code 200
=====================================
To remove a topping from the inventory:
DELETE /inventory/{topping}

Response
HTTP Code 200

# Running

To run this Spring Boot application, you have several options:

From the command line: Navigate to the root directory of the project (where the pom.xml or build.gradle file is located) and run the following command: 

mvn spring-boot:run

From within your IDE: If you're using an IDE like IntelliJ IDEA or Eclipse, you can right-click on the ChallengeApplication class and select Run 'ChallengeApplication'.

Building and running a JAR file: You can build the project into a JAR file and then run it using the java -jar command. First, build the JAR file:

mvn clean package

Then, navigate to the target or build directory and run the JAR file:

java -jar challenge-0.0.1-SNAPSHOT.jar

Replace challenge-0.0.1-SNAPSHOT.jar with the name of your JAR file.

Before running the project, make sure you have the correct version of Java and the build tool (Maven or Gradle) installed.