package org.observer_pattern;
import javax.management.timer.Timer;
import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.TimerTask;
public class DataAquisitor implements Subject{
    ArrayList<Observer> observers;
    int val1;
    int val2;
    SecureRandom randomizer;

    public DataAquisitor(){
        this.randomizer = new SecureRandom();
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
        System.out.println("registered");
    }

    @Override
    public void unregisterObserver(Observer o){
        int i  =  observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);

    }

    @Override
    public void notifyObservers(){
        for (Observer o:observers){
            o.update(val1, val2);
        }
    }

    public void run(){
        int count = 0;

        while (true){
            changeValues();
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            if (count++ == 10) break;
        }
    }
    private void changeValues(){
        // generate random numbers val11 and val2
        val1 = randomizer.nextInt(10);
        val2 = randomizer.nextInt(100);
        notifyObservers();
    }
}
