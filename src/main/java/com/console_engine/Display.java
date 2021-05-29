package com.console_engine;

import com.players.Board;
import com.ships.*;

public class Display {
    public void printGameMenu(){
        System.out.println("GAME MENU");
    }


    public Board printShipPlacementProcess(Input input){
        Board tempBoard = new Board();

        int row = 0;
        int col = 0;
        for(ShipType ship: ShipType.values()) {

            boolean isShipPositionOk = false;
            do {
                System.out.println("Current ship to place on board: " + ship);

                // TODO - working on getting correct coordinate, should work already
                int [] coordinates = input.getCoordinates();
                row = coordinates[0];
                col = coordinates[1];


                if(!tempBoard.isPlacementOk(row, col, ship.size)) {
                    isShipPositionOk = false;
                    System.out.println("Ship can not be placed in this position");
                } else {
                    isShipPositionOk = true;
                }


            }while (!isShipPositionOk);



            switch (ship){
                case CARRIER:
                    tempBoard.placeShipOnBoard(new Carrier(row, col));
                    break;
                case BATTLESHIP:
                    tempBoard.placeShipOnBoard(new BattleShip(row, col));
                    break;
                case CRUISER:
                    tempBoard.placeShipOnBoard(new Cruiser(row, col));
                    break;
                case SUBMARINE:
                    tempBoard.placeShipOnBoard(new Submarine(row, col));
                    break;
                case DESTROYER:
                    tempBoard.placeShipOnBoard(new Destroyer(row, col));
                    break;
            }


        }

        return tempBoard;
    }


    public void printGamePlay(){
        System.out.println("GAME PLAY");
    }


    public void printGameOver(){
        System.out.println("PRINT GAME OVER");
    }

    private void currentShipPlacement(ShipType shipType) {
        System.out.println("Current ship to place on board: " + shipType);
    }
}
