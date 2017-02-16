package edu.tomer;

/**
 * Created by hackeru on 16/02/2017.
 */
public class DefencePlayer extends Player {
    private int numOfFouls = 0;

    /*
    * Constructors:
    */
    public DefencePlayer() {
        super();
    }

    public DefencePlayer(String name, int pctFromTheLine) {
        super(name, pctFromTheLine);
    }

    public void doFoul(){
        numOfFouls++;
        System.out.println("Tackled");
    }


}
