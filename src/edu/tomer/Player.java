package edu.tomer;

/**
 * Created by hackeru on 16/02/2017.
 */
public class Player {
    private String name;
    private int pctFromTheField;
    protected int score = 0;

    /*
    * Constructors
    * */
    public Player() {
        name = IO.getString("Enter Player Name:");
        pctFromTheField = IO.getInt("Enter Pct from the field:", 0, 100);
    }

    public Player(String name, int pctFromTheLine) {
        this.name = name;
        this.pctFromTheField = pctFromTheLine;
    }

    /*
    * Methods:
    * */
    public boolean shootFromTwo() {
        int shoot = RandomUtils.getInt(0, 100);
        if (shoot <= pctFromTheField) {
            score += 2;
            return true;
        }
        return false;
    }

//    @Override
//    public String toString() {
//       return "Name: " + name +"\n" +
//              "Pct From The Field: "+ pctFromTheField;
//    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", pctFromTheField=" + pctFromTheField +
                ", score=" + score +
                '}';
    }

    /*
                *Getters and setters:
                */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPctFromTheField() {
        return pctFromTheField;
    }

    public void setPctFromTheField(int pctFromTheField) {
        this.pctFromTheField = pctFromTheField;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
