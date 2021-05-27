package com.ships;

public enum SquareStatus {
    EMPTY ("#"),
    SHIP ("S"),
    HIT ("H"),
    MISSED ("M"),
    WRECKED ("W");


    public final String status;

    private SquareStatus(String status){
        this.status = status;
    }

}
