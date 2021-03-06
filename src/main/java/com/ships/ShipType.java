package com.ships;

public enum ShipType {
    CARRIER (5),
    BATTLESHIP (4),
    CRUISER(3),
    SUBMARINE(3),
    DESTROYER(2);

    public final int size;

    private ShipType(int size){
        this.size = size;
    }
}
