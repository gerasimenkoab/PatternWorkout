package org.decorator_pattern;

public class DecoratorDemo {
    public DecoratorDemo(){}
    public void run(){
        System.out.println("============Decorator is ready.==============");
        Beverage drink1 =  new Espresso('l');
        checkout(drink1);
        Beverage drink2 = new Espresso('m');
        drink2 = new ConPanna(drink2);
        checkout(drink2);
        Beverage drink3 = new Capuchino();
        drink3 = new WithSyrup(drink3);
        drink3 = new WithCinnamon(drink3);
        drink3 = new WithSugar(drink3);
        checkout(drink3);

    }
    public void checkout(Beverage drink){
        System.out.printf("%s  $ %4.2f\n", drink.getDescription(), drink.cost());
    }
}
