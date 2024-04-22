package org.observer_pattern;

public class DataWindow1 implements Observer{
    private Subject DA;
    public DataWindow1(Subject s){
        this.DA = s;
        DA.registerObserver(this);
    }
    @Override
    public void update(int input1, int input2){
        System.out.println("Window 1: Displaying new value:"+ input1);
    }
}
