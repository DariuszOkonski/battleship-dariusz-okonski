package com.ships;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    protected final List<Square> positions = new ArrayList<>();
    protected String name;
    protected int size;
    protected ShipType shipType;
    public abstract void setShipOnPosition(Square[][] ocean);

    public List<Square> getPositions() {
        return positions;
    }
}

//    public abstract boolean isPositionAvailable(Square[][] ocean);
//    public abstract boolean isPositionEdgesAvailable(Square[][] ocean);