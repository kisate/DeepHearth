package com.company.Skills;

import com.company.HeroParams.Skill;
import com.company.Scale;
import com.company.Unit;

/**
 * Created by Dima on 23.02.2017.
 */
public class Heal extends Skill{
    public Heal(Unit owner) {
        super(owner);
        name = "Heal";
        cost = 10;
        dmgMod = Scale.C;
        accuracyMod = 1;
        description = "Add target unit " + power +" health points " + owner.damage;
    }

    @Override
    public void use(Unit target) {
        super.use(target);
        System.out.println("Healed " + target.name + " giving" + power + "hp");
        target.modHealth(-power);
    }
}
