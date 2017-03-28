package com.company.Effects;

import com.company.Effect;
import com.company.EffectTypes;
import com.company.Unit;

/**
 * Created by Dima on 20.03.2017.
 */
public class Bleeding extends Effect {

    public Bleeding(Unit target) {
        super(target);
        type = EffectTypes.Nonmagic;
    }

    public Bleeding(Unit target, int turns, int power){
        this(target);
        this.turns = turns;
        this.power = power;
    }

    @Override
    public void apply() {
        super.apply();
        target.modHealth(power);
        System.out.println(target.name + " has lost " + power + " health from bleeding");
    }
}
