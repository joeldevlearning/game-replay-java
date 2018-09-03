package com.gamereplay.data;

public abstract class GameEvent {

    public final double timeIndex;

    public GameEvent(double timeIndex) {
        this.timeIndex = timeIndex;
    }
}
