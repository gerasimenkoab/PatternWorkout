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
        Owl nightOwl = new NightOwl();
        Duck duckFromAdapter = new DuckAdapter(nightOwl);
        System.out.printf("%s\n","Duck actions:");
        clientRunsDuck(enDuck);
        System.out.printf("%s \n", "Duck from adapter actions:");
        clientRunsDuck(duckFromAdapter);
    }
    private void clientRunsDuck(Duck duck){
        duck.quak();
        duck.fly();
    }
}
