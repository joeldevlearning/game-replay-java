package com.example;

import java.util.ArrayList;

public class Score extends GameEvent {

    public final int points;
    public final String scoredByName;
    public final int scoredByNum;

    public Score(double time, String scoredByName, int scoreByNum, int points) {
        super(time);
        this.points = points;
        this.scoredByName = scoredByName;
        this.scoredByNum = scoreByNum;
    }

    @Override
    public String toString() {
        return String.format(
                this.scoredByNum + this.scoredByName +
                        "scores "
                        + this.points + "points");
    }
}
