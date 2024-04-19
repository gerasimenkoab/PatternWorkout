package org.strategy_pattern;

public class WeaponLaser implements WeaponBehaviour{
    @Override
    public void doAction(){
        System.out.println("------------->");
    }
}
