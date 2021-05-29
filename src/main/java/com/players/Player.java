package com.players;

import com.ships.Ship;

import java.util.List;

public class Player {
    private List<Ship> ships;
    private Board board;
    private String name;

    public Player(List<Ship> ships, Board board, String name) {
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
