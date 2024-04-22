package org.decorator_pattern;

public class Espresso extends Beverage {
    public Espresso(char s) {
        if( s == 's'){
            this.size = Size.SMALL;
        }
        if(s =='m'){
            this.size = Size.MEDIUM;
        }
        if(s=='l'){
            this.size = Size.LARGE;
        }
        this.description = "Espresso";
    }

    public double cost() {
        return 1.5 * getSizePriceMult();
    }
}
