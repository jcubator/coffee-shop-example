package com.coffeeshop.coffeedrinks;

import com.coffeeshop.CoffeeDrink;

public class Espresso extends CoffeeDrink
{
    public static final String DEFAULT_NAME = "Espresso";

    public Espresso()
    {
        super(DEFAULT_NAME, 12f);
    }
}
