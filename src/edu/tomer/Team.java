package edu.tomer;

import java.util.ArrayList;

/**
 * Created by hackeru on 16/02/2017.
 */
public class Team {
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void addPlayer() {
        int choice = IO.getInt("Which Player to add?\n" +
                "1)Offence Player\n" +
                "2)Defence Player", 1, 2);

        if (choice == 1)
            players.add(new OffencePlayer());
        else if (choice == 2)
            players.add(new DefencePlayer());
    }

    public void removePlayer(Player p){
        players.remove(p);
    }

    public void removePlayer(String name){
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                players.remove(p);
                break;
            }
        }
    }

    public void printPlayers(){
        System.out.println(players);
    }
}
