package org.adapter;

import org.main.Demo;

public class AdapterDemo extends Demo {

    public AdapterDemo(){
        this.helloMessage = "================ Adapter Demo is Ready.===================";
    }
    @Override
    public void run() {
        System.out.printf("%s\n", this.helloMessage);
        Duck enDuck = new EnglishDuck();
        RusDuck ruDuck = new RusDuck();
        Duck duckFromAdapter = new RusDuckAdapter(ruDuck);
        System.out.printf("%s\n","Duck actions:");
        enDuck.quak();
        enDuck.fly();
        System.out.printf("%s \n", "Duck from adapter actions:");
        duckFromAdapter.quak();
        duckFromAdapter.fly();
    }
}
