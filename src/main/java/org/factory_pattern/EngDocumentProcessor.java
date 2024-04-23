package org.factory_pattern;

public class EngDocumentProcessor extends DocumentProcessor{
    @Override
    public MyDocument createDocument(String type) {
        if (type.equals("empty")){
            return new EngDocument();
        }else if (type.equals("filled")){
            return new EngDocument("filled with english text");
        }
        else return null;
    }
}
