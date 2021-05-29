package com.console_engine;

import com.players.Board;

public class ConsoleEngine {
    public static final ConsoleEngine INSTANCE = new ConsoleEngine();

    private Input input;
    private Display display;

    private ConsoleEngine(){
        this.input = new Input();
        this.display = new Display();
    }

    public Board createPlayerBoard() {
        return this.display.printShipPlacementProcess(this.input);
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

}
