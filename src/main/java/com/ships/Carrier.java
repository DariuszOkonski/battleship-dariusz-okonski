package com.ships;

public class Carrier extends Ship {

    public Carrier(int row, int col) {
        this.name = ShipType.CARRIER.toString();
        this.size = ShipType.CARRIER.size;
        this.shipType = ShipType.CARRIER;
        this.setShip(row, col);
    }
}

