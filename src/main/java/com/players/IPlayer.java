package com.players;

import com.ships.IShip;
import com.ships.ISquare;

import java.util.List;

public interface IPlayer {
    String getName();
    Board getBoard();
    List<IShip> getShips();
    boolean isAnyShipsLeft();
    ISquare getSingleSquareObjectFromPlayer(int row, int col);
    void setMissedShoot(int row, int col);
    void setHitShip(int row, int col);

    void checkIfShipHasBeenDestroyed();
}
