package com.players;

import com.ships.*;

import java.util.List;

public class Board {
    public static final int BOARD_SIZE = 10;
    private ISquare[][] battleField;

    public Board(){
        this.battleField = createBattlefield();
    }

    public void setMissedShootOnBoard(int row, int col) {
        this.battleField[row][col] = new Square(row, col);
    }

    public void placeShipOnBoard(IShip ship){
        List<ISquare> tempShip = ship.getPositions();
        for (int i = 0; i < tempShip.size() ; i++) {
            this.battleField[tempShip.get(i).getRow()][tempShip.get(i).getCol()] = tempShip.get(i);
        }
    }

    public boolean isPlacementOk(int row, int col, int shipSize) {
        return isPositionAvailable(row, col, shipSize) && isPositionEdgesAvailable(row, col, shipSize);
    }

    public ISquare getSingleSquareObjectFromBoard(int row, int col) {
        return this.battleField[row][col] = new Square(row, col, SquareStatus.MISSED);
    }

    public ISquare[][] getBattleField() {
        return battleField;
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
        int firsRow = row - 1;
        int lastRow = firsRow + 2;

        int firstCol = col - 1;
//        int lastCol = shipSize + 2;
        int lastCol = firstCol + shipSize + 1;


        for (int r = firsRow; r <= lastRow; r++) {
            for (int c = firstCol; c <= lastCol; c++) {
                try {
                    if(this.battleField[r][c] != null)
                        return false;
                } catch (ArrayIndexOutOfBoundsException err) {
                    continue;
                }
            }
        }
        return true;
    }

    private ISquare[][] createBattlefield(){
        ISquare[][] battleField = new Square[BOARD_SIZE][];
        for (int i = 0; i < BOARD_SIZE; i++) {
            battleField[i] = new Square[BOARD_SIZE];
        }
        return battleField;
    }
}


