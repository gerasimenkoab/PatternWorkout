package org.adapter;

public class DuckAdapter implements Duck{
    Owl owl;
    public DuckAdapter(Owl owl){
        this.owl = owl;
    }
    public void quak(){
        this.owl.uhu();
    }
    public void fly(){
        this.owl.shortFly();
        this.owl.shortFly();
        this.owl.shortFly();
    }
}
