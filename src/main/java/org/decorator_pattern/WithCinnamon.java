package org.decorator_pattern;

public class WithCinnamon extends ToppingDecorator{
    Beverage beverage;
    public WithCinnamon(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + " with cinnamon";
    }

    public double cost(){
        return this.beverage.cost() + 0.1;
    }
}
