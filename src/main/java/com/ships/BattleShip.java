package com.ships;

public class BattleShip extends Ship {

    public BattleShip(int row, int col) {
        this.name = ShipType.BATTLESHIP.toString();
        this.size = ShipType.BATTLESHIP.size;
        this.shipType = ShipType.BATTLESHIP;
        this.setShip(row, col);
    }
}
