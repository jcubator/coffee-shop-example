package com.coffeeshop;

import com.coffeeshop.coffeedrinks.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String[] coffeeDrinkNames = new String[] {
                Cappuccino.DEFAULT_NAME,
                Espresso.DEFAULT_NAME,
                Latte.DEFAULT_NAME,
                Macchiato.DEFAULT_NAME,
                Mochaccino.DEFAULT_NAME,
        };

        // Display the menu
        System.out.println("Available coffee drinks:");
        for (String coffeeDrinkName : coffeeDrinkNames)
        {
            System.out.println("- " + coffeeDrinkName);
        }

        // Ask for desired coffee drinks
        ArrayList<CoffeeDrink> order = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter coffee drink you wish: ");
            Scanner scanner = new Scanner(System.in);
            String coffeeDrinkName = scanner.nextLine();
            if (coffeeDrinkName.isEmpty())
            {
                break;
            }

            try
            {
                order.add(CoffeeDrinkFactory.create(coffeeDrinkName));
            }
            catch (RuntimeException e)
            {
                System.out.println(e.getMessage());
            }
        }

        // Analyse the order
        float totalPrice = 0;
        for (CoffeeDrink coffeeDrink : order)
        {
            totalPrice += coffeeDrink.getPrice();
        }
        System.out.println("Amount to be paid: " + totalPrice);
    }
}
