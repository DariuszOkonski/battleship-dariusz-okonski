package com.console_engine;

import com.players.BoardFactory;
import com.players.IPlayer;
import com.ships.*;

import java.util.Dictionary;
import java.util.List;

public class Display {
    private final Dictionary<Character, Integer> rowsDictionary;
    private final Dictionary<Character, Integer> columnsDictionary;
    private Input input;

    public Display(Dictionary<Character, Integer> rowsDictionary, Dictionary<Character, Integer> columnsDictionary) {
        this.rowsDictionary = rowsDictionary;
        this.columnsDictionary = columnsDictionary;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public String printGameMenu(){
        String response;

        System.out.println("BATTLESHIPS");
        System.out.println("===========");
        System.out.println("Menu:");
        System.out.println("1 - Player vs Player (manually)");
        System.out.println("2 - Player vs Player (randomly)");
        System.out.println("Q - Quit");
        System.out.printf("Choice: ");

        response = this.input.getOptionFromMenu();

        return response;
    }


    // method to create new Player with Boards and Ship List, using class BoardFactory
    public IPlayer shipsPlacementProcessManual(Input input, String name){
        var tempBoardFactory = new BoardFactory();
        return tempBoardFactory.manualPlacement(input, this, name);
    }

    public IPlayer shipsPlacementProcessRandom(Input input, String name) {
        var tempBoardFactory = new BoardFactory();
        return tempBoardFactory.randomPlacement(input, this, name);
    }

    public void displayAttacker(IPlayer attacker) {
        System.out.println("Attacker: " + attacker.getName());
    }

    public void displayDefender() {
        System.out.println("Defender:");
    }

    public void afterGivingAShot() {
        System.out.println();
        System.out.println(" ===> BOARD AFTER GIVING A SHOOT <=== ");
        System.out.println();
    }

    public void pressAnyButton() {
        System.out.println();
        System.out.printf(" ===> PRESS ANY BUTTON <===");
        System.out.println();
    }

    public void displayShipsLeft(List<IShip> ships) {
        System.out.println("Ships left: " + ships.size());
    }

    public void displayShipDestroyed(String name) {
        System.out.println("Ship is destroyed: " + name);
    }

    public void displayBoard(ISquare[][] board) {
        String tempAlphabeth = "ABCDEFGHIJ";
        System.out.println();

        System.out.printf("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.printf(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            System.out.printf(tempAlphabeth.charAt(i) + " ");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null){
                    System.out.printf(" " + board[i][j].getCharacter() + " ");
                }
                else {
                    System.out.printf(" ~ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // ========================================== INFORMATION METHODS
    public void currentShipToPlaceInfo(ShipType ship) {
        System.out.println("-------------------------------------------");
        System.out.println("Current ship to place on board: " + ship);
    }

    public void displayWinner(String name) {
        System.out.println(name + " has WON!!!");
    }

    public void noShipInCurrentPositionInfo() {
        System.out.println("Ship can not be placed in this position");
    }

    public void addCoordinatesInfo() {
        System.out.print("Type coordinates (A-J)(0-9): ");
    }

    public void wrongCoordinatesLengthInfo() {
        System.out.println("Coordinates Length must be equal: 2");
    }

    public void outOfRangeCoordinatesInfo() {
        System.out.println("You typed coordinates out of range A-J, 0-9");
    }

    public void displayPlayerName(String name) {
        System.out.println("Player: " + name);
    }

    public void printGamePlay(){
        System.out.println("GAME PLAY");
    }

    public void printGameOver(){
        System.out.println("PRINT GAME OVER");
    }

}
