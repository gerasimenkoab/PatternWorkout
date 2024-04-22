package org.main;
import org.decorator_pattern.DecoratorDemo;
import org.strategy_pattern.StrategyDemo;
import org.observer_pattern.ObserverDemo;

public class Main {
    /*
    * This project is done to illustrate some common patterns.
    *  */
    public static void main(String[] args) {
        System.out.println("Lets start testing patterns");
        StrategyDemo demo1 = new StrategyDemo();
        demo1.run();
        ObserverDemo demo2 = new ObserverDemo();
        demo2.run();
        DecoratorDemo demo3 = new DecoratorDemo();
        demo3.run();

    }
}