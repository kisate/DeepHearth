package com.company;

import com.company.HeroParams.Skill;

import java.util.LinkedList;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Unit{
    public int maxHealth, maxMana;
    public int stunDef, moveDef, curseDef, holyDef, nmDef;
    public int health, mana, damage, accuracy;
    public int luck, dodge, defence, critical = 0;
    public int speed;
    public String description;
    public UnitTypes type;
    public LinkedList<Skill> skills = new LinkedList<Skill>();
    public LinkedList<Effect> effects = new LinkedList<Effect>();
    public String name;
    public boolean isDead = false, manaEnded = false;
    public Team team;
    public void modHealth (int amount) {
        health-=amount;
        if ((health <= 0) && !isDead) die();
    }

    public void manaEnd(){
        System.out.println(name + " is out of mana");
    }

    public void die() {
        System.out.println(name + " died");
        isDead = true;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", mana=" + mana +
                ", description='" + description + '\'' +
                '}';
    }
}
