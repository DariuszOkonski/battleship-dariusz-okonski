import com.players.Board;
import com.ships.*;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();


//        Carrier carrier2 = new Carrier(1, 4);
//        board.placeShipOnBoard(carrier2);
//
        boolean responseInner = board.isPositionAvailable(1, 20, ShipType.CARRIER.size);
        boolean responseOuter = board.isPositionEdgesAvailable(1, 1, ShipType.CARRIER.size);
        System.out.println(responseOuter);

//        Carrier carrier = new Carrier(1, 1);
//        board.placeShipOnBoard(carrier);
//
//        BattleShip battleShip = new BattleShip(2, 3);
//        board.placeShipOnBoard(battleShip);
//
//        Cruiser cruiser = new Cruiser(5, 5);
//        board.placeShipOnBoard(cruiser);
//
//        Submarine submarine = new Submarine(7, 1);
//        board.placeShipOnBoard(submarine);
//
//        Destroyer destroyer = new Destroyer(9, 1);
//        board.placeShipOnBoard(destroyer);


        board.printBoard();
    }

}
