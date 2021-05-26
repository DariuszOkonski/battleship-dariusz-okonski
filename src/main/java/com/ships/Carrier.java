package com.ships;

public class Carrier extends Ship {

    public Carrier() {
        this.name = ShipType.CARRIER.toString();
        this.size = ShipType.CARRIER.size;
    }


    @Override
    public boolean isPositionAvailable(Square[][] ocean) {
        return false;
    }

    @Override
    public boolean isPositionEdgesAvailable(Square[][] ocean) {
        return false;
    }

    @Override
    public void setShipOnPostion(Square[][] ocean) {

    }
}
