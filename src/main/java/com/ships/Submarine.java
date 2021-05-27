package com.ships;

public class Submarine extends Ship{
    public Submarine(int row, int col){
        this.name = ShipType.SUBMARINE.toString();
        this.size = ShipType.SUBMARINE.size;
        this.shipType = ShipType.SUBMARINE;
        this.setShip(row, col);
    }
}
