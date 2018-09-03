package com.example;

import java.time.Instant;
import java.util.ArrayList;

public abstract class GameEvent {

    public final double timeIndex;

    public GameEvent(double timeIndex) {
        this.timeIndex = timeIndex;
    }
}
