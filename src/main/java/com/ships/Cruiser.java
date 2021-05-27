package com.ships;

public class Cruiser extends Ship {

    public Cruiser(int row, int col){
        this.name = ShipType.CRUISER.toString();
        this.size = ShipType.CRUISER.size;
        this.shipType = ShipType.CRUISER;
        this.setShip(row, col);
    }
}
