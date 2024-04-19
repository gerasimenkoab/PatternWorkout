package org.strategy_pattern;

public class CharacterMage extends Character{
    public CharacterMage(){
        this.name = "Mage";
    }
    public CharacterMage(String name){
        this.name = "Mage "+name;
        this.setWeapon(new WeaponFireball());
    }
}
