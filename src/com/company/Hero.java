package com.company;

import com.company.HeroParams.Feature;
import com.company.HeroParams.Skill;
import com.company.Heroes.HeroClasses;

import java.util.LinkedList;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Hero extends Unit implements Hireable{
    public int experience, level, defence, dexterity, speed;
    public HeroClasses heroClass;
    public String name;
    private Team team;
    public boolean isDead = false;

    public Hero(int defence, int dexterity, int speed, String name, Team team) {
        this.defence = defence;
        this.dexterity = dexterity;
        this.speed = speed;
        this.name = name;
        this.team = team;
        experience = 0;
        level = 1;
    }

    public Hero(Team team, String name) {
        this(1, 1, 1, name, team);
    }

    public LinkedList<Feature> features = new LinkedList<Feature>();
    public LinkedList<Item> items = new LinkedList<Item>();
    public LinkedList<Skill> skills = new LinkedList<Skill>();

    @Override
    public void die() {
        System.out.println(name + " died");
        isDead = true;
    }

    @Override
    public String toString() {
        return heroClass + "{" +
                "name=" + name +
                ", description=" + description +
                ", health=" + health +
                ", experience=" + experience +
                ", level=" + level +
                ", defence=" + defence +
                ", dexterity=" + dexterity +
                ", heroClass=" + heroClass +
                ", features=" + features +
                ", items=" + items +
                ", skills=" + skills +
                '}';
    }
}
