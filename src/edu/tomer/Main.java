package edu.tomer;

public class Main {

    public static void main(String[] args) {

        Team hbs = new Team();
        Team mcb = new Team();
        // hbs.addPlayer(new DefencePlayer("Moshe", 90));

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter player for hbs:");
            hbs.addPlayer();
            System.out.println("Enter player for mcb:");
            mcb.addPlayer();
        }
        int mcbScore = 0;
        int hbsScore = 0;

        for (int i = 0; i < 30; i++) {
            if (hbs.shoot())
                hbsScore += 2;
            if (mcb.shoot())
                mcbScore += 2;
        }

        System.out.println("Maccabi: " + mcbScore);
        System.out.println("Hapoel Beer Sheva: " + hbsScore);
    }
}
