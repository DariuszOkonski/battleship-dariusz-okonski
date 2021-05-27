import com.players.Board;
import com.ships.*;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();

        Carrier carrier = new Carrier(1, 2);
        board.placeShipOnBoard(carrier);

        BattleShip battleShip = new BattleShip(3, 3);
        board.placeShipOnBoard(battleShip);

        Cruiser cruiser = new Cruiser(5, 5);
        board.placeShipOnBoard(cruiser);

        Submarine submarine = new Submarine(7, 1);
        board.placeShipOnBoard(submarine);

        Destroyer destroyer = new Destroyer(9, 9);
        board.placeShipOnBoard(destroyer);


        board.printBoard();
    }

}
