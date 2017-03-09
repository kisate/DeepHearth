package com.company;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Unit {
    public int health, mana;
    public String description;
    public UnitTypes type;

    public void modHealth (int amount) {
        health-=amount;
        if (health <= 0) die();
    }

    public void die() {
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
