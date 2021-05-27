package com.ships;

public class Square {
    private int row;
    private int col;
    private boolean isHit = false;
    private SquareStatus squareStatus = SquareStatus.EMPTY;

    public Square(int row, int col){
        this.row = row;
        this.col = col;
    }

    public String getCharackter(){
        return squareStatus.status;
    }
}
