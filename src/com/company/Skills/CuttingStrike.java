package com.company.Skills;

import com.company.Effects.Bleeding;
import com.company.HeroParams.Skill;
import com.company.Probability;
import com.company.Scale;
import com.company.Unit;

/**
 * Created by Dima on 27.03.2017.
 */
public class CuttingStrike extends Skill  {
    public CuttingStrike(Unit owner) {
        super(owner);
        name = "Cutting strike";
        cost = 0;
        dmgMod = Scale.D;
        accuracyMod = 0.85;
        description = "Add target unit bleeding" + power +" for 3 turns";
    }

    @Override
    public void action(Unit target) {
        super.action(target);
        if (new Probability(100 - target.nmDef, 100).check()) {
            target.effects.add(new Bleeding(target, 3, power));
            System.out.println(owner.name + " used Cutting Strike on " + target.name + " giving " + power + " bleeding for 3 turns");
        }
        else
        {
            System.out.println("resist");
        }
    }
}
