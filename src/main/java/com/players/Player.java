package com.players;

import com.ships.IShip;
import com.ships.ISquare;

import java.util.Collections;
import java.util.List;

public class Player implements IPlayer {
    //Cruiser, Destroyer, Submarine
    private List<IShip> ships;
    private Board board;
    private String name;

    public Player(List<IShip> ships, Board board, String name) {
        this.ships = ships;
        this.board = board;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public List<IShip> getShips() {
        return ships;
    }

    public boolean isAnyShipsLeft() {
        return this.ships.size() > 0;
    }

    public ISquare getSingleSquareObjectFromPlayer(int row, int col) {
        return this.board.getSingleSquareObjectFromBoard(row, col);
    }

    public void setMissedShoot(int row, int col) {
        this.board.setMissedShootOnBoard(row, col);
    }

    public void setHitShip(int row, int col) {
        this.board.setHitShipOnBoard(row, col);
    }

    public void checkIfShipHasBeenDestroyed() {
        boolean isShipDestroyed = false;
        IShip tempShip = null;

        for(IShip ship: this.ships) {
            isShipDestroyed = true;

            for(ISquare square: ship.getPositions()) {

                if(!square.isHit()){
                    isShipDestroyed = false;
                    tempShip = null;
                    break;
                }
                tempShip = ship;
            }

            if(isShipDestroyed)
                break;
        }

        if(isShipDestroyed) {
            System.out.println("Ship is destroyed: " + tempShip.getName());
            for(ISquare square: tempShip.getPositions()) {
                square.setDestroyed();
            }

            ships.remove(tempShip);
            System.out.println(Collections.unmodifiableList(ships));
        }
    }
}
