package com.company.HeroParams;

import com.company.Unit;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Skill {
    public int cost;
    public String name, description;
    public void use(Unit target, Unit user){
        if (user.mana < cost) System.out.println("Not enough mana");
        else {
            System.out.println(user.name + " uses " + name + " on " + target.name);
        }
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
