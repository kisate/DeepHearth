package com.company;

import java.util.Scanner;

/**
 * Created by Dima on 27.03.2017.
 */
public class Battle {
    Player player1, player2;
    int turnNumber = 0;
    Team moveOrder = new Team();
    Scanner sc = new Scanner(System.in);
    public Battle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        moveOrder = player1.team;
        moveOrder.addAll(player2.team);
        moveOrder.sort(new SpeedComparator());
    }

    public int makeTurn(){
        for (Unit unit : moveOrder) {
            for (Effect effect :
                    unit.effects) {
                effect.apply();
            }
            if (unit.isDead) {
                moveOrder.remove(unit);
                continue;
            }

            System.out.println("Units :");
            for (Unit x :
                    moveOrder) {
                System.out.println(x);
            }
            System.out.println(unit + " makes his move");
            System.out.println("Type 2 ints");
            int skill = sc.nextInt();
            int target = sc.nextInt();
            unit.skills.get(skill).use(moveOrder.get(target));
        }
        if ((player1.team.size() == 0) || (player2.team.size() == 0)) return 1;
        turnNumber++;
        return 0;
    }

}
