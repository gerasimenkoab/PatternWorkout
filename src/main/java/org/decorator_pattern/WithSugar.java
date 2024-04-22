package org.decorator_pattern;

public class WithSugar extends ToppingDecorator{
    public WithSugar(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return this.beverage.getDescription() + " with sugar";
    }
    public double cost(){
        return this.beverage.cost();
    }
}
