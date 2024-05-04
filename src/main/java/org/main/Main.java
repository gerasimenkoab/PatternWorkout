package org.main;
import java.util.ArrayList;

public class Main {
    /*
    * This project is done to illustrate some common patterns.
    *  */
    public static void main(String[] args) {
        ArrayList<String> demoType;
        Demo demo;
        System.out.println("Lets start testing patterns");
        DemoFactory demoFactory = new DemoFactory();
        demoType = demoFactory.getImplemented();
        for (String type: demoType ) {
            demo = demoFactory.create(type);
            demo.run();
        }

    }
}