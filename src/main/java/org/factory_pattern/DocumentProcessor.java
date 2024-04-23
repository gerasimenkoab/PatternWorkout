package org.factory_pattern;

public abstract class DocumentProcessor {

    public abstract MyDocument  createDocument(String type);

    public void PrepareDocument(String type){
        MyDocument document;
        document = createDocument(type);
        document.fill();
        document.spellcheck();
        document.translate();
        document.illlustrate();
        document.sigh();
        document.display();
    }
}
