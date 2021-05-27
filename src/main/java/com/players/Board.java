package com.players;

import com.ships.Carrier;
import com.ships.Square;

public class Board {
    private static final int BOARD_SIZE = 10;
    private Square[][] battleField;

    public Board(){
        this.battleField = createBattlefield();
    }

    public void placeShipOnBoard(){
        Carrier carrier = new Carrier(2,2);
        for (int i = ; i < ; i++) {

        }
    }

    private Square[][] createBattlefield(){
        Square[][] battleField = new Square[BOARD_SIZE][];
        for (int i = 0; i < BOARD_SIZE; i++) {
            battleField[i] = new Square[BOARD_SIZE];
        }
        return battleField;
    }


}


