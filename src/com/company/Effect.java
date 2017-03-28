package com.company;

/**
 * Created by student3 on 09.03.17.
 */
public abstract class Effect {
    public EffectTypes type;
    public String name, description;
    public Unit target;
    public int turns, power;
    public Effect(Unit target) {
        this.target = target;
    }

    public void apply(){
        if (turns == 0) {
            target.effects.remove(this);
        }
        else turns--;
    }
}
