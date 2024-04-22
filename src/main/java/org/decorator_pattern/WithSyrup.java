package org.decorator_pattern;

public class WithSyrup extends ToppingDecorator{
    Beverage beverage;
    public WithSyrup(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + "with syrup";
    }

    public double cost(){
        return this.beverage.cost() + 0.3;
    }
}
