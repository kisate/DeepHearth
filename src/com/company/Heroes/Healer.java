package com.company.Heroes;

import com.company.Hero;
import com.company.Scale;
import com.company.Skills.Heal;
import com.company.Team;

/**
 * Created by Dima on 23.02.2017.
 */
public class Healer extends Hero{

    public Healer(int dexterity, int power, String name, Team team) {
        super(dexterity, power, name, team);
        description = "Heals allies";
        heroClass = HeroClasses.Healer;
        hpScale = Scale.C;
        mpScale = Scale.S;
        dodgeScale = Scale.B;
        crtScale = Scale.A;
        speedScale = Scale.C;
        dmgScale = Scale.C;
        holyDef = 100;
        curseDef = 70;
        moveDef = 30;
        nmDef = 20;
        stunDef = 30;
        luck = 10;
        countStats();
    }
}
