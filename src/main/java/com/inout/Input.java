package com.inout;

import com.players.Board;

import java.util.*;

public class Input {
    private final String alphabeth = "abcdefghij";
    private final Dictionary<Character, Integer> rowsDictionary;
    private final Dictionary<Character, Integer> columnsDictonary;
    private Scanner scanner;

    public Input() {
        this.rowsDictionary = createRowsDictionary();
        this.columnsDictonary = createColsDictionary();
        this.scanner = new Scanner(System.in);
    }

    public int[] getCoordinates() {
        int[] coordinatesArray = new int[2];
        boolean areCoordinatesOk;

        do {
            areCoordinatesOk = true;
            System.out.print("Podaj koordynaty (A-J)(0-9): ");
            String coordinates = this.scanner.nextLine();
            System.out.println(coordinates);

            if(coordinates.length() != 2) {
                System.out.println("Coordinates Length must be equal: 2");
                areCoordinatesOk = false;
                continue;
            }

            char row = Character.toUpperCase(coordinates.charAt(0));
            char col = Character.toUpperCase(coordinates.charAt(1));

            if(this.rowsDictionary.get(row) == null || this.columnsDictonary.get(col) == null) {
                System.out.println("You typed coordinates out of range A-J, 0-9");
                areCoordinatesOk = false;
                continue;
            }


            coordinatesArray[0] = this.rowsDictionary.get(row);
            coordinatesArray[1] = this.columnsDictonary.get(col);




        } while (!areCoordinatesOk);



        return coordinatesArray;
    }

//    public String getData(){
//        return "dwad";
//    }

//    public void InputValidation(){
//        System.out.println("Input Val");
//    }

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
