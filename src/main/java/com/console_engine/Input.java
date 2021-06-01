package com.console_engine;

import java.util.*;

public class Input {
    private final Dictionary<Character, Integer> rowsDictionary;
    private final Dictionary<Character, Integer> columnsDictionary;
    private Scanner scanner;
    private Display display;

    public Input(Dictionary<Character, Integer> rowsDictionary, Dictionary<Character, Integer> columnsDictionary, Display display) {
        this.rowsDictionary = rowsDictionary;
        this.columnsDictionary = columnsDictionary;
        this.scanner = new Scanner(System.in);
        this.display = display;
    }

    // method responsible for taking correct coordinates while ships are placing on board
    public int[] getCoordinates() {
        int[] coordinatesArray = new int[2];
        coordinatesArray = this.inputValidation();

        return coordinatesArray;
    }

    public String getOptionFromMenu() {
        return this.scanner.nextLine().toUpperCase();
    }

    // method responsible for checking if new ship coordinates are correct
    private int[] inputValidation(){
        boolean areCoordinatesOk;
        int[] coordinatesArray = new int[2];

        do {
            areCoordinatesOk = true;
            this.display.addCoordinatesInfo();
            String coordinates = this.scanner.nextLine();
//            System.out.println(coordinates);

            if(coordinates.length() != 2) {
                this.display.wrongCoordinatesLengthInfo();
                areCoordinatesOk = false;
                continue;
            }

            char row = Character.toUpperCase(coordinates.charAt(0));
            char col = Character.toUpperCase(coordinates.charAt(1));

            if(this.rowsDictionary.get(row) == null || this.columnsDictionary.get(col) == null) {
                this.display.outOfRangeCoordinatesInfo();
                areCoordinatesOk = false;
                continue;
            }

            coordinatesArray[0] = this.rowsDictionary.get(row);
            coordinatesArray[1] = this.columnsDictionary.get(col);

        } while (!areCoordinatesOk);

        return coordinatesArray;
    }
}
