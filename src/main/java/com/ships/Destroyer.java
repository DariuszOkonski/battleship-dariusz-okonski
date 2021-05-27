package com.ships;

public class Destroyer extends Ship {
    public Destroyer(int row, int col){
        this.name = ShipType.DESTROYER.toString();
        this.size = ShipType.DESTROYER.size;
        this.shipType= ShipType.DESTROYER;
        this.setShip(row, col);
    }
}
