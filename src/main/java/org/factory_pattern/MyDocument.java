package org.factory_pattern;

public abstract class MyDocument {
    String locale;
    String text;
    abstract public void fill();
    abstract public  void spellcheck();
    abstract public void translate();
    abstract public void illlustrate();
    abstract public void sigh();
    public void display(){
        System.out.printf("Text locale %s:\n %s \n",this.locale, this.text);
    }
}
