package com.ships;

public class Square implements ISquare {
    private int row;
    private int col;
    private boolean isHit = false;
    private SquareStatus squareStatus = SquareStatus.EMPTY;

    public Square(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getCharacter(){
        return squareStatus.status;
    }
}
