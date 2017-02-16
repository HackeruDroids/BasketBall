package edu.tomer;

/**
 * Created by hackeru on 16/02/2017.
 */
public class OffencePlayer extends Player {
    private int pctFromThree;

    public OffencePlayer() {
        super();
        this.pctFromThree = IO.getInt("Enter pct from 3:");
    }

    public OffencePlayer(String name, int pctFromTheField, int pctFromThree) {
        super(name, pctFromTheField);
        this.pctFromThree = pctFromThree;
    }

    public boolean shootFromThree(){
        int shoot = RandomUtils.getInt(0, 100);
        if (shoot<=pctFromThree){
            score += 3; //protected accessible with inheritance
            return true;
        }
        return false;
    }
}
