package edu.tomer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Player p = new Player("Michael Jordan", 80);
            players.add(p);
        }

        System.out.println(players);

    }
}
