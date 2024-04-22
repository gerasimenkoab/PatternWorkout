package org.decorator_pattern;

public abstract class Beverage {
    protected String description = "Drink";
    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
