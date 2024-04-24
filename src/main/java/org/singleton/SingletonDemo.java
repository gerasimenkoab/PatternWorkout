package org.singleton;

import org.main.Demo;

public class SingletonDemo  extends Demo {
    String helloMessage;
    public SingletonDemo(){
        this.helloMessage = "==============Singleton is ready.==================";
    }
    public void run(){
        System.out.println(helloMessage);
    }
}
