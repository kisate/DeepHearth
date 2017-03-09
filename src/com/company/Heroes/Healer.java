package com.company.Heroes;

import com.company.Hero;
import com.company.Skills.Heal;
import com.company.Team;

/**
 * Created by Dima on 23.02.2017.
 */
public class Healer extends Hero{

    public Healer(int defence, int dexterity, int speed, String name, Team team) {
        super(defence, dexterity, speed, name, team);
        description = "Heals allies";
        skills.add(new Heal());
        heroClass = HeroClasses.Healer;
        health = 10;
        mana = 20;
    }

    public Healer(Team team, String name) {
        this(3, 7, 5, name, team);
    }
}
