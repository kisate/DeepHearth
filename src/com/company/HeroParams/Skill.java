package com.company.HeroParams;

import com.company.Probability;
import com.company.Scale;
import com.company.Unit;

import java.util.Random;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Skill {
    public int cost;
    public int power, accuracy;
    public Scale dmgMod;
    public double accuracyMod;
    public String name, description;
    public Unit owner;
    public Skill(Unit owner) {
        this.owner = owner;
        power = (int)(owner.damage*dmgMod.scale);
        accuracy = (int)(owner.accuracy*accuracyMod);
    }

    public void use(Unit target){
        if (owner.mana < cost) System.out.println("Not enough mana");
        else{
            owner.mana-=cost;
            if (new Probability(owner.luck + accuracy, owner.luck + accuracy + target.luck + target.dodge).check()) {
                action(target);
            }
            else System.out.println(owner.name + " missed");
            if (owner.mana <= 0) owner.manaEnd();
        }
    }

    public void action(Unit target){
        System.out.println(owner.name + " uses " + name + " on " + target.name);
    }
    @Override
    public String toString() {
        return "Skill{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
