package com.example;
/*

*/

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Game {

    private ArrayList<GameEvent> GameLog;
    private HashMap<Integer, String> Roster;

    public static void main(String[] args) {
        init();
        replay();
    }

    public static void init() {
        HashMap<Integer, String> Roster = new HashMap();
        Roster.put(1, "Matt");
        Roster.put(99, "Joel");

        ArrayList<GameEvent> GameLog = new ArrayList<GameEvent>();
        GameLog.add(new Score('0',"Matt",1, 2));
        GameLog.add(new Score('0',"Joel",99, 3));

        for (GameEvent gameEvent : GameLog) {
            System.out.println(gameEvent);
        }
    }

    public static void replay() {
        //iterate through gamelog, print to console
    }

    //create Log

    //read arguments, choose REPLAY or LIVEPLAY
    //if replay, inject json into log and prepopulate

    //game init creates a new log instance
    //game init creates teams and players
    //game goes into run


}
