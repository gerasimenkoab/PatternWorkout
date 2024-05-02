package org.main;
import java.util.ArrayList;
import java.util.Arrays;
import org.abstract_factory.AbstractFactoryDemo;
import org.command.CommandDemo;
import org.decorator_pattern.DecoratorDemo;
import org.factory_pattern.FactoryDemo;
import org.observer_pattern.ObserverDemo;
import org.singleton.SingletonDemo;
import org.strategy_pattern.StrategyDemo;
import org.command.CommandDemo;

public class Factory {
    ArrayList<String> implemented = new ArrayList<>(Arrays.asList("strategy","observer",
            "factory","abstract_factory","singleton","command"));
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
            case"command":
                return new CommandDemo();
            default:
                return null;
        }
    }
    public ArrayList<String> getImplemented(){
        return implemented;
    }
}
