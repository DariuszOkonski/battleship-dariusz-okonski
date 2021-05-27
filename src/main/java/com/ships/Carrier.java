package com.ships;

public class Carrier extends Ship {

    public Carrier(int row, int col) {
        this.name = ShipType.CARRIER.toString();
        this.size = ShipType.CARRIER.size;
        this.shipType = ShipType.CARRIER;
        setShip(row, col);
    }

    private void setShip(int row, int col){
        for (int i = col; i < (this.size + col) ; i++) {
            Square square = new Square(row, i);
            this.positions.add(square);
        }
    }


    @Override
    public void setShipOnPosition(Square[][] ocean) {

    }
}


