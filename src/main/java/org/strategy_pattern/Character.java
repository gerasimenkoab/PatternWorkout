package org.strategy_pattern;

public abstract class Character {
    private WeaponBehaviour weapon;
    protected String name;

    private void attack(){
        weapon.doAction();
    }

    public void setWeapon(WeaponBehaviour newWeapon){
        System.out.println(this.name+" changes weapon");
        this.weapon = newWeapon;
    }

    public void display(){
        System.out.printf("%s attack:", this.name);
        this.attack();
    }
}
