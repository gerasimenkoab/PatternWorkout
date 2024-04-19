package org.strategy_pattern;

public class CharacterRobot extends Character{
    public CharacterRobot(){
        this.name = "Robot";
        this.setWeapon(new WeaponLaser());
    }
    public CharacterRobot(String name){
        this.name = "Robot "+name;
        this.setWeapon(new WeaponLaser());
    }
}
