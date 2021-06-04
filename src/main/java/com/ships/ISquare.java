package com.ships;

public interface ISquare {
    int getRow();
    int getCol();
    String getCharacter();
    String getShipCharacter();
    ISquare getInstance();
    void setHit();
    boolean isHit();
    void setDestroyed();
}
