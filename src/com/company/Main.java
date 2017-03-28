package com.company;

import com.company.Heroes.Healer;
import com.company.Heroes.HeroConstructor;
import com.company.Heroes.Swordsman;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HeroConstructor constructor = new HeroConstructor();
        LinkedList<Player> players = new LinkedList<Player>();
        players.add(new Player());
        players.add(new Player());
        players.get(0).team.add(constructor.constructSwordsman("Mark", players.get(0).team));
        //players.get(0).team.add(constructor.constructHealer("Bob", players.get(0).team));
        players.get(1).team.add(constructor.constructSwordsman("Stan", players.get(1).team));
        //players.get(1).team.add(constructor.constructHealer("Matt", players.get(1).team));
        players.get(0).team.get(0).speed = 2;
        //players.get(0).team.get(1).speed = 1;
        players.get(1).team.get(0).speed = 3;
        //players.get(1).team.get(1).speed = 2;

        Battle battle = new Battle(players.get(0), players.get(1));
        while (battle.makeTurn() == 0) battle.makeTurn();
//        System.out.println("Player1's team :" );
//        for (Hero hero : players.get(0).team) {
//            System.out.println("\t" + hero);
//        }
//        System.out.println("Player2's team :" );
//        for (Hero hero : players.get(1).team) {
//            System.out.println("\t" + hero);
//        }
//        Scanner sc = new Scanner(System.in);
//        double c = -0.5;
//        while(sc.next() != "-1") {
//            System.out.println("Player1's team :" );
//            for (Hero hero : players.get(0).team) {
//                System.out.println("\t" + hero);
//            }
//            System.out.println("Player2's team :" );
//            for (Hero hero : players.get(1).team) {
//                System.out.println("\t" + hero);
//            }
//            System.out.println("Player's #" + (int)(c + 1.5) + "turn");
//            System.out.println("Type 4 ints");
//            players.get((int)(0.5 + c)).makeTurn(sc.nextInt(), sc.nextInt(), players.get(sc.nextInt()), sc.nextInt());
//            c*= -1;
//        }
    }
}
