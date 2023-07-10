package week10_liveSession.vendingMachine;

public class Drink {
     /*

DrinksVending [object types, ArrayList, constructor, Scanner, loops, methods]

    Create a program that will allow you to select a Drink from the vending machine.

    Create a Drink class:
        create instance variables: name, price, quantity
        create a constructor to initialize all the variables
        create a toString to print the object in a clean format
     */

    String name;
    double price;
    int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " | $" + price +" | Total quantity=" + quantity;
    }
}
