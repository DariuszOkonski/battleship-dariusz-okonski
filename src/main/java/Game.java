import com.console_engine.ConsoleEngine;
import com.console_engine.Input;
import com.players.BoardFactory;
import com.players.Player;
import com.ships.ISquare;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Player player1 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-1");
        ConsoleEngine.INSTANCE.displayBoard(player1);

        System.out.println("===================================================");
        Player player2 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-2");
        ConsoleEngine.INSTANCE.displayBoard(player2);
    }

}
