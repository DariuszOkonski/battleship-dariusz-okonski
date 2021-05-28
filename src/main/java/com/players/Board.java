package com.players;

import com.ships.Carrier;
import com.ships.Ship;
import com.ships.ShipType;
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

    public boolean isPlacementOk(int row, int col, int shipSize) {
        return isPositionAvailable(row, col, shipSize) && isPositionEdgesAvailable(row, col, shipSize);
    }


    private boolean isPositionAvailable(int row, int col, int shipSize) {
        try {
            for (int i = col; i < (shipSize + col); i++) {
                if(this.battleField[row][i] != null)
                    return false;
            }
            return true;
        } catch (ArrayIndexOutOfBoundsException err) {
            return false;
        }
    }

    private boolean isPositionEdgesAvailable(int row, int col, int shipSize) {
        int tempRow = row - 1;
        int tempCol = col - 1;
        int tempShipSize = shipSize + 2;
        int row_depth = 3;

        for (int i = tempRow; i < row_depth; i++) {
            for (int j = tempCol; j < tempShipSize; j++) {
                try {
                    if(this.battleField[i][j] != null)
                        return false;
                } catch (ArrayIndexOutOfBoundsException err) {
                    continue;
                }
            }
        }

        return true;
    }

    private Square[][] createBattlefield(){
        Square[][] battleField = new Square[BOARD_SIZE][];
        for (int i = 0; i < BOARD_SIZE; i++) {
            battleField[i] = new Square[BOARD_SIZE];
        }
        return battleField;
    }

//    Temporarily method to remove later
    public void printBoard(){
        for (int i = 0; i < this.battleField.length; i++) {
            for (int j = 0; j < this.battleField[i].length; j++) {
                if (this.battleField[i][j] != null){
                    System.out.printf(" # ");
                }
                else {
                    System.out.printf(" - ");
                }
            }
            System.out.println();
        }
    }


}


