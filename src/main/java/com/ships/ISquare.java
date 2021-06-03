package com.ships;

public interface ISquare {
    int getRow();
    int getCol();
    String getCharacter();
    ISquare getInstance();
    void setHit();
    boolean isHit();
    void setDestroyed();
}
