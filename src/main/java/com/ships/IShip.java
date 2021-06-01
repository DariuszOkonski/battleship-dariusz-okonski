package com.ships;

import java.util.List;

public interface IShip {

    public List<ISquare> getPositions();

//    void setShip(int row, int col);

    int getSize();

    public Ship getInstance();

}
