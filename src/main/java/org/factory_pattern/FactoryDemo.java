package org.factory_pattern;

import org.main.Demo;

public class FactoryDemo  extends Demo {
    public void run(){
        System.out.println("=============Factory is ready.================");
        DocumentProcessor DP1 = new EngDocumentProcessor();
        DP1.PrepareDocument("empty");
        DP1.PrepareDocument("filled");
        DocumentProcessor DP2 = new RuDocumentProcessor();
        DP2.PrepareDocument("empty");
        DP2.PrepareDocument("filled");
    }
}
