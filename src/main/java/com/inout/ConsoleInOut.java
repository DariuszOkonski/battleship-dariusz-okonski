package com.inout;

import com.players.Board;
import com.players.Player;

public class ConsoleInOut {
    public static final ConsoleInOut INSTANCE = new ConsoleInOut();

    private Input input;
    private Display display;

    private ConsoleInOut(){
        this.input = new Input();
        this.display = new Display();
    }

    public Board createPlayerBoard() {
        return this.display.printShipPlacementProcess(this.input);
    }

    public static ConsoleInOut getInstance(){
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

}
