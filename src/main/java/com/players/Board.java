package com.players;

import com.ships.Carrier;
import com.ships.Ship;
import com.ships.Square;

import java.util.List;

public class Board {
    private static final int BOARD_SIZE = 10;
    private Square[][] battleField;

    public Board(){
        this.battleField = createBattlefield();
    }

    public void placeShipOnBoard(Ship ship){
        List<Square> tempShip = ship.getPositions();
        for (int i = 0; i < tempShip.size() ; i++) {
            this.battleField[tempShip.get(i).getRow()][tempShip.get(i).getCol()] = tempShip.get(i);
        }
    }

    private Square[][] createBattlefield(){
        Square[][] battleField = new Square[BOARD_SIZE][];
        for (int i = 0; i < BOARD_SIZE; i++) {
            battleField[i] = new Square[BOARD_SIZE];
        }
        return battleField;
    }


    public void printBoard(){
        for (int i = 0; i < this.battleField.length; i++) {
            for (int j = 0; j < this.battleField[i].length; j++) {
                if (this.battleField[i][j] != null){
                    System.out.printf("#");
                }
                else {
                    System.out.printf("-");
                }
            }
            System.out.println();
        }
    }


}


