package com.players;

import com.ships.IShip;

import java.util.List;

public class Player implements IPlayer {
    // Carrier, BattleShip, Cruiser, Destroyer, Submarine
    private List<IShip> ships;
    private Board board;
    private String name;

    public Player(List<IShip> ships, Board board, String name) {
        this.ships = ships;
        this.board = board;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }
}
