package org.abstract_factory;

import org.main.Demo;

public class AbstractFactoryDemo extends Demo {
    String helloMessage;
    public AbstractFactoryDemo(){
        this.helloMessage = "============== AbstractFactory is ready.==================";
    }
    public void run(){
        System.out.println(helloMessage);
    }
}
