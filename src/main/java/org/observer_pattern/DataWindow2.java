package org.observer_pattern;

public class DataWindow2 implements Observer{
    private Subject DA;

    public DataWindow2(Subject s){
        this.DA = s;
        DA.registerObserver(this);
    }
    @Override
    public void update(int input1, int input2){
        System.out.println("Window 2: Displaying new value new value:"+ String.valueOf(input2));
    }

}
