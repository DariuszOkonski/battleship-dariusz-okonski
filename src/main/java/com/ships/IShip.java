package com.ships;

import java.util.List;

public interface IShip {

    List<ISquare> getPositions();

    int getSize();
    Ship getInstance();
    String getName();
}
