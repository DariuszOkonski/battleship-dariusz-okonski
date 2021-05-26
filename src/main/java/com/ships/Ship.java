package com.ships;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    protected final List<Square> positions = new ArrayList<>();
    protected String name;

    public Ship(String name){
        this.name = name;
    }

    public abstract boolean isPositionAvailable();
    public abstract boolean isPositionEdgesAvailable();
    public abstract void setShipOnPostion();
}
