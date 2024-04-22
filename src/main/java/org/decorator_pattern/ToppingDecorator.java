package org.decorator_pattern;
// decorator class for Beverage class objects
public abstract class ToppingDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
    public Size getSize(){
        return this.beverage.getSize();
    }
}
