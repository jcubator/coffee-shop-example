package com.coffeeshop;

import com.coffeeshop.coffeedrinks.*;

/**
 * {@see https://www.tutorialspoint.com/design_pattern/factory_pattern.htm}
 */
public class CoffeeDrinkFactory
{
    public static CoffeeDrink create(String name)
    {
        switch (name)
        {
            case Cappuccino.DEFAULT_NAME:
                return new Cappuccino();
            case Espresso.DEFAULT_NAME:
                return new Espresso();
            case Latte.DEFAULT_NAME:
                return new Latte();
            case Macchiato.DEFAULT_NAME:
                return new Macchiato();
            case Mochaccino.DEFAULT_NAME:
                return new Mochaccino();
            default:
                throw new RuntimeException("Such type of coffee does not exist");
        }
    }
}
