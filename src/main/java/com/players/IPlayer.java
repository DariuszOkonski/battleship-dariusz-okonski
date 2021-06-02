package com.players;

import com.ships.IShip;

import java.util.List;

public interface IPlayer {
    String getName();
    Board getBoard();
    List<IShip> getShips();
}
