package com.inout;

public class ConsoleInOut {
    public static final ConsoleInOut INSTANCE = new ConsoleInOut();

    private Input input;
    private Display display;

    private ConsoleInOut(){
        this.input = new Input();
        this.display = new Display();
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
