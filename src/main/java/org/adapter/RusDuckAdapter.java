package org.adapter;

public class RusDuckAdapter implements Duck{
    RusDuck rusDuck;
    public RusDuckAdapter(RusDuck rusDuck){
        this.rusDuck = rusDuck;
    }
    public void quak(){
        this.rusDuck.kryakaet();
    }
    public void fly(){
        this.rusDuck.letit();
        this.rusDuck.letit();
        this.rusDuck.letit();
    }
}
