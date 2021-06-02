package com.players;

import com.console_engine.Display;
import com.console_engine.Input;
import com.ships.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoardFactory {
    public Player randomPlacement(Input input, Display display, String name) {
        Board tempBoard = new Board();
        List<IShip> tempShips = new ArrayList<>();

        for(ShipType ship: ShipType.values()) {
            int [] coordinates = checkCoordinatesRandom(tempBoard, ship);

            int row = coordinates[0];
            int col = coordinates[1];

            this.addShipToBoardAndList(ship, tempBoard, tempShips, row, col);
        }

        display.displayPlayerName(name);
        display.displayBoard(tempBoard.getBattleField());

        return new Player(tempShips, tempBoard, name);
    }

    public Player manualPlacement(Input input, Display display, String name) {
        Board tempBoard = new Board();
        List<IShip> tempShips = new ArrayList<>();


        for(ShipType ship: ShipType.values()) {
            int [] coordinates = checkCoordinatesManual(input, display, tempBoard, ship);

            int row = coordinates[0];
            int col = coordinates[1];

            this.addShipToBoardAndList(ship, tempBoard, tempShips, row, col);
            display.displayBoard(tempBoard.getBattleField());
        }

        return new Player(tempShips, tempBoard, name);
    }

    private int[] checkCoordinatesRandom(Board tempBoard, ShipType ship) {
        boolean isShipPositionOk;
        int [] coordinates = new int[2];
        Random random = new Random();

        do {
            isShipPositionOk = true;
            int row = random.nextInt(Board.BOARD_SIZE);
            int col = random.nextInt(Board.BOARD_SIZE);

            if(!tempBoard.isPlacementOk(row, col, ship.size)) {
                isShipPositionOk = false;
                continue;
            }
            coordinates[0] = row;
            coordinates[1] = col;
        } while (!isShipPositionOk);

        return coordinates;
    }

    private int[] checkCoordinatesManual(Input input, Display display, Board tempBoard, ShipType ship) {
        boolean isShipPositionOk;
        int [] coordinates;
        int row = 0;
        int col = 0;

        do {
            isShipPositionOk = true;
            display.currentShipToPlaceInfo(ship);

            coordinates = input.getCoordinates();
            row = coordinates[0];
            col = coordinates[1];

            if(!tempBoard.isPlacementOk(row, col, ship.size)) {
                isShipPositionOk = false;
                display.noShipInCurrentPositionInfo();
            }
        }while (!isShipPositionOk);

        return coordinates;
    }

    private void addShipToBoardAndList(ShipType ship, Board tempBoard, List<IShip> tempShips, int row, int col) {
        switch (ship){
            case CARRIER:
                Carrier carrier = new Carrier(row, col);
                tempBoard.placeShipOnBoard(carrier);
                tempShips.add(carrier);
                break;
            case BATTLESHIP:
                BattleShip battleShip = new BattleShip(row, col);
                tempBoard.placeShipOnBoard(battleShip);
                tempShips.add(battleShip);
                break;
            case CRUISER:
                Cruiser cruiser = new Cruiser(row, col);
                tempBoard.placeShipOnBoard(cruiser);
                tempShips.add(cruiser);
                break;
            case SUBMARINE:
                Submarine submarine = new Submarine(row, col);
                tempBoard.placeShipOnBoard(submarine);
                tempShips.add(submarine);
                break;
            case DESTROYER:
                Destroyer destroyer = new Destroyer(row, col);
                tempBoard.placeShipOnBoard(destroyer);
                tempShips.add(destroyer);
                break;
        }
    }
}
