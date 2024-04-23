package org.factory_pattern;

public class RuDocumentProcessor extends DocumentProcessor{
    @Override
    public MyDocument createDocument(String type) {
        if (type.equals("empty")){
            return  new RuDocument();
        }else if(type.equals("filled")){
            return new RuDocument("наполнен русским текстом");
        }else return null;
    }
}
