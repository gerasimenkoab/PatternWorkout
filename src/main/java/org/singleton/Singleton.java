package org.singleton;

public class Singleton {
    private static volatile Singleton uniqueExemplar; // use volatile for syncronization in threads
    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueExemplar == null){
            synchronized (Singleton.class) { // use syncronization in threads
                if (uniqueExemplar == null) {
                    System.out.println("Singleton does not exist yet.");
                    uniqueExemplar = new Singleton();
                }
            }
        }else{
            System.out.println("Already exists.");
        }
        return uniqueExemplar;
    }

    public void display(){
        System.out.println("Hello from singleton.");
    }
}
