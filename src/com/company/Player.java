package com.company;

import java.util.LinkedList;

/**
 * Created by Dima on 23.02.2017.
 */
public class Player {
    Team team = new Team();
    public void makeMove(int user, int spell, Player enemy, int target) {
        team.get(user).skills.get(spell).use(enemy.team.get(target));
    }
}
