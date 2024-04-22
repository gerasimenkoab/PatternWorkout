package org.decorator_pattern;

public class ConPanna extends ToppingDecorator{
    Beverage beverage;
    public ConPanna(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
      return this.beverage.getDescription()+ " con Panna";
    }

    public double cost(){
        return this.beverage.cost()+ 0.5;
    }
}
