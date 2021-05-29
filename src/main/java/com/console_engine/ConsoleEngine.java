package com.console_engine;

import com.players.Board;
import com.players.Player;

import java.util.Dictionary;
import java.util.Hashtable;

public class ConsoleEngine {
    public static final ConsoleEngine INSTANCE = new ConsoleEngine();

    private final String alphabeth = "abcdefghij";
    private final Dictionary<Character, Integer> rowsDictionary;
    private final Dictionary<Character, Integer> columnsDictonary;

    private Input input;
    private Display display;

    private ConsoleEngine(){
        this.rowsDictionary = createRowsDictionary();
        this.columnsDictonary = createColsDictionary();

        this.display = new Display(this.rowsDictionary, this.columnsDictonary);
        this.input = new Input(this.rowsDictionary, this.columnsDictonary, this.display);
    }

    public void displayBoard(Player player) {
        display.displayPlayerName(player.getName());
        this.getDisplay().displayBoard(player.getBoard().getBattleField());
    }

    public Player createPlayerBoardsAndShipsList(String name) {
//        System.out.println("Player: " + name);
        display.displayPlayerName(name);
        return this.display.shipsPlacementProcess(this.input, name);
    }

    public static ConsoleEngine getInstance(){
        return INSTANCE;
    }

    public Input getInput() {
        return input;
    }

    public Display getDisplay() {
        return display;
    }

    public void gameMenu(){
        System.out.println("GameMenu");
    }

    private Dictionary<Character, Integer> createColsDictionary() {
        Dictionary<Character, Integer> tempDict = new Hashtable<>();
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            String tempStr = Integer.toString(i);
            Character key = tempStr.charAt(0);
            tempDict.put(key, i);
        }
        return tempDict;
    }

    private Dictionary<Character, Integer> createRowsDictionary() {
        Dictionary<Character, Integer> tempDict = new Hashtable<>();
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            Character key =  Character.toUpperCase(this.alphabeth.charAt(i));
            tempDict.put(key, i);
        }
        return tempDict;
    }

}
