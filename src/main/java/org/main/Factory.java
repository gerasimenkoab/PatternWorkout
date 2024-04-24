package org.main;
import java.util.ArrayList;
import java.util.Arrays;
import org.abstract_factory.AbstractFactoryDemo;
import org.decorator_pattern.DecoratorDemo;
import org.factory_pattern.FactoryDemo;
import org.observer_pattern.ObserverDemo;
import org.singleton.SingletonDemo;
import org.strategy_pattern.StrategyDemo;

public class Factory {
    ArrayList<String> implemented = new ArrayList<>(Arrays.asList("strategy","observer","factory","abstract_factory","singleton"));
    public Demo create(String type){
        switch(type){
            case "strategy" :
                return new StrategyDemo();
            case "observer" :
                return new ObserverDemo();
            case "decorator" :
                return new DecoratorDemo();
            case "factory" :
                return new FactoryDemo();
            case "abstract_factory" :
                return new AbstractFactoryDemo();
            case"singleton":
                return new SingletonDemo();
            default:
                return null;
        }
    }
    public ArrayList<String> getImplemented(){
        return implemented;
    }
}
