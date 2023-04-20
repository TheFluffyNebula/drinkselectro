package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        Drink drink = new Drink();
        System.out.println(drink);
        Drink drink2 = new Drink("Coke", 1.99, 12, 150);
        System.out.println(drink2);
    }
}
