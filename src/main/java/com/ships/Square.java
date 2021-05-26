package com.ships;

public class Square {
    private int x;
    private int y;
    private boolean isHit = false;
    private SquareStatus squareStatus = SquareStatus.EMPTY;

    public Square(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getCharackter(){
        return squareStatus.status;
    }
}
