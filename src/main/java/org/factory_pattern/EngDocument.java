package org.factory_pattern;

public class EngDocument extends MyDocument{
    public EngDocument(){
        this.text = "";
        this.locale = "Eng";
    }
    public EngDocument(String text){
        this.text = text;
        this.locale = "Eng";
    }
    public void fill(){
        text += " Fill with english for testing";
    }
    public void spellcheck(){

    }
    public void translate(){}
    public void illlustrate(){}
    public void sigh(){}

    }
