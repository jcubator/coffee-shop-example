package com.coffeeshop;

/**
 * {@see http://proglang.su/java/abstraction}
 */
public abstract class CoffeeDrink
{
    private final String name;
    private final float price;

    protected CoffeeDrink(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }
}
