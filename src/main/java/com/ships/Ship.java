package com.ships;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    protected final List<Square> positions = new ArrayList<>();
    protected String name;
    protected int size;
    protected ShipType shipType;

//    public abstract void setShipOnPosition(Square[][] ocean);

    public List<Square> getPositions() {
        return positions;
    }

    protected void setShip(int row, int col){
        for (int i = col; i < (this.size + col) ; i++) {
            Square square = new Square(row, i);
            this.positions.add(square);
        }
    }

    public int getSize() {
        return size;
    }

    public Ship getInstance() {
        return this;
    }
}

//    public abstract boolean isPositionAvailable(Square[][] ocean);
//    public abstract boolean isPositionEdgesAvailable(Square[][] ocean);