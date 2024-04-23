package org.factory_pattern;

public class RuDocument extends MyDocument{
    public RuDocument(){
        this.text = "";
        this.locale = "Ru";
    }
    public RuDocument(String text){
        this.text = text;
        this.locale = "Ru";
    }
    public void fill(){
        text += " Наполняем русским текстом для проверки";
    }
    public void spellcheck(){}
    public void translate(){}
    public void illlustrate(){}
    public void sigh(){}
}
