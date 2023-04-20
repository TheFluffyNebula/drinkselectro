package edu.guilford;

import java.util.Random;

public class Drink {
    Random random = new Random();
    //attributes
    private String name;
    private double price;
    private int quantity;
    private int calories;

    //constructors
    public Drink() {
        String[] possible = new String[]{"Coke", "Pepsi", "Sprite", "Water"};
        name = possible[random.nextInt(possible.length)]; //copilot
        price = random.nextDouble() * 10;
        quantity = random.nextInt(100); //oz
        calories = random.nextInt(100) * 3;
    }

    public Drink(String name, double price, int quantity, int calories) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.calories = calories;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //toString
    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", calories=" + calories +
                '}';
    }

    //methods
    public double getCostPerOunce(){
        return price / quantity;
    }

    public double getCaloriesPerOunce(){
        return calories / quantity;
    }
    
}
