package org.singleton;

import org.main.Demo;

public class SingletonDemo  extends Demo {
    String helloMessage;
    public SingletonDemo(){
        this.helloMessage = "==============Singleton is ready.==================";
    }
    public void run(){
        System.out.println(helloMessage);
        System.out.println("First initialization attempt:");
        Singleton test1 = Singleton.getInstance();
        test1.display();
        System.out.println("Second initialization attempt:");
        Singleton test2 = Singleton.getInstance();
        test2.display();
//      Next line gives error.
//      Singleton test3 = new Singleton();

    }
}
