package com.company;

import com.company.HeroParams.Feature;
import com.company.HeroParams.Skill;
import com.company.Heroes.HeroClasses;

import java.util.LinkedList;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Hero extends Unit implements Hireable{
    private int prDexterity, prPower, prdefence;
    public Scale hpScale, crtScale, mpScale, speedScale, dodgeScale, dmgScale, accScale;
    public int power, dexterity, experience, level;
    public HeroClasses heroClass;

    public Hero(int dexterity, int power, String name,  Team team) {
        this.prDexterity = dexterity;
        this.prPower = power;
        this.name = name;
        this.team = team;
        type = UnitTypes.Hero;
        level = 1;
        experience = 0;
    }

    public void manaEnd() {}

    public void countStats() {
        maxHealth = (int)(power * hpScale.scale);
        maxMana = (int)(power * mpScale.scale);
        critical = (int)(power * crtScale.scale);
        dodge = (int)(dexterity * dodgeScale.scale);
        speed = (int)(dexterity * speedScale.scale);
        damage = (int)(power* dmgScale.scale);
        accuracy = (int)(power*accScale.scale);
    }

    public LinkedList<Feature> features = new LinkedList<Feature>();
    public LinkedList<Item> items = new LinkedList<Item>();


    @Override
    public String toString() {
        return heroClass + "{" +
                "name=" + name +
                ", description=" + description +
                ", health=" + health +
                ", experience=" + experience +
                ", level=" + level +
                ", damage=" + damage +
                ", defence=" + defence +
                ", dexterity=" + dexterity +
                ", power=" + power +
                ", heroClass=" + heroClass +
                ", features=" + features +
                ", items=" + items +
                ", skills=" + skills +
                '}';
    }
}
