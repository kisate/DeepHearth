package com.company.Heroes;

import com.company.Hero;
import com.company.Skills.SwordStrike;
import com.company.Team;

/**
 * Created by Dima on 23.02.2017.
 */
public class Swordsman extends Hero {

    public Swordsman(int defence, int dexterity, int speed, String name, Team team) {
        super(defence, dexterity, speed, name, team);
        skills.add(new SwordStrike());
        description = "Strikes enemies with his sword";
        heroClass = HeroClasses.Swordsman;
        health = 20;
        mana = 0;
    }

    public Swordsman(Team team, String name) {
        this(12, 4, 5, name, team);
    }
}
