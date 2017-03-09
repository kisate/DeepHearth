package com.company.Skills;

import com.company.HeroParams.Skill;
import com.company.Unit;

/**
 * Created by Dima on 23.02.2017.
 */
public class Heal extends Skill{
    public Heal() {
        name = "Heal";
        description = "Add target unit 5 health points";
        cost = 10;

    }

    @Override
    public void use(Unit target, Unit user) {
        super.use(target, user);
        System.out.println("Healed " + target.name + " giving 5 hp");
        target.modHealth(-5);
    }
}
