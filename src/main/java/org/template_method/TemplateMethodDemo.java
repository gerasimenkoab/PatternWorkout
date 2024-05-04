package org.template_method;

import org.main.Demo;

public class TemplateMethodDemo extends Demo {
    /*
    Tmplate method will be implemented for differet sort algoritms.
    Basic Abstract template;
    1.final void createRandomArray(int size) - default implemented
    abstract void hook() - iterrupt funciton, e.g. timestamp
    2.final void displayArray() - default implemented
    3.sortArray() - exchangeble depending on sort algorithm
    4.final void displayArray()
    abstract void hook() - iterrupt funciton, e.g. timestamp
    */
    public TemplateMethodDemo(){
        this.helloMessage = "================ Template Method Demo. ===============";
    }

    @Override
    public void run() {
        System.out.printf("%s \n", this.helloMessage);
    }
}
