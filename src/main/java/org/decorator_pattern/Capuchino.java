package org.decorator_pattern;

public class Capuchino extends Beverage{
    public Capuchino(){
        this.description = "Capuchino";
    }

    public double cost(){
        return 2.9;
    }
}
