package org.decorator_pattern;

public abstract class Beverage {
    protected enum Size{SMALL, MEDIUM, LARGE};
    protected Size size = Size.SMALL;
    protected String description = "Drink";
    public String getDescription(){
        return this.description + " " +  size;
    }
    public Size getSize(){
        return this.size;
    }
    public void setSize(Size size){
        this.size = size;
    }

    public abstract double cost();

    public double getSizePriceMult(){
        double mult = 1.0;
        switch (size) {
            case Size.SMALL:
                mult = 1.0;
                break;
            case MEDIUM:
                mult = 1.5;
                break;
            case LARGE:
                mult = 2.0;
                break;
            case null:
                mult = 1.0;
                break;
        }
        return mult;
    }
}
