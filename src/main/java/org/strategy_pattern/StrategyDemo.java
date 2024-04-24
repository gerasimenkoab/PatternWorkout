package org.strategy_pattern;

import org.main.Demo;

public class StrategyDemo  extends Demo {
    public StrategyDemo()
    {
        System.out.println("============Strategy pattern demo.==============");
    }

    public void run(){

        Character[] monsters= new Character[2];
        monsters[0] = new CharacterRobot("Pepe");
        monsters[1] = new CharacterMage("Xardas");
        for (Character monster : monsters)
        {
            monster.display();
        }
        monsters[1].setWeapon(new WeaponSnowball());
        monsters[1].display();

    }
}
