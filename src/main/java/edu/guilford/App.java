package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        Drink d = new Drink();
        System.out.println(d);
        Drink d2 = new Drink("Coke", 1.99, 12, 150);
        System.out.println(d2);
        System.out.println("cost per ounce: " + d2.getCostPerOunce());
        ArrayList<Drink> drinks = new ArrayList<Drink>();
        for (int i = 0; i<10; i++){
            Drink drink = new Drink();
            drinks.add(drink);
        }
        double total = 0;
        for (Drink drink : drinks){
            System.out.println(drink);
            total += drink.getPrice();
        }
        System.out.println("Total price: " + total);
    }
}
