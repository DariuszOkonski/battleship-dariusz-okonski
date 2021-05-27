import com.players.Board;
import com.ships.*;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();

        Carrier carrier = new Carrier(2, 2);
        board.placeShipOnBoard(carrier);

        BattleShip battleShip = new BattleShip(4, 3);
        board.placeShipOnBoard(battleShip);

        System.out.println(board);
    }

}
