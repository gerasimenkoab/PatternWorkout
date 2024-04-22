package org.decorator_pattern;

public class Latte extends Beverage{
    public Latte(){
        this.description = "Latte";
    }
    public double cost(){
        return 2.1;
    }
}
