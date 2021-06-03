package com.ships;

import java.util.List;

public interface IShip {

    List<ISquare> getPositions();

//    void setShip(int row, int col);

    int getSize();
    Ship getInstance();
    String getName();
}
