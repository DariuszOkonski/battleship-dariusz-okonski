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

    public Square(int row, int col, SquareStatus squareStatus){
        this.row = row;
        this.col = col;
        this.squareStatus = squareStatus;
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

    public ISquare getInstance() {
        return this;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit() {
        this.isHit = true;
        this.squareStatus = SquareStatus.HIT;
    }

    public void setDestroyed() {
        this.squareStatus = SquareStatus.WRECKED;
    }
}
