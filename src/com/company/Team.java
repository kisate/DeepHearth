package com.company;

import java.util.LinkedList;

/**
 * Created by Dima on 23.02.2017.
 */
public class Team extends LinkedList<Unit> {

    public void applyEffects() {
        for (Unit unit : this) {
            for (Effect effect :
                    unit.effects) {
                effect.apply();
            }
        }
    }
}
