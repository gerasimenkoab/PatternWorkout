package org.observer_pattern;

import org.main.Demo;

import javax.xml.crypto.Data;

// TODO implement Observer example
public class ObserverDemo  extends Demo {
    public ObserverDemo(){
    }

    public void run(){
        System.out.println("=========Observer is ready.===============");
        DataAquisitor DA = new DataAquisitor();
        DataWindow1 DW1 = new DataWindow1(DA);
        DataWindow2 DW2 = new DataWindow2(DA);
        DA.run();
    }
}
