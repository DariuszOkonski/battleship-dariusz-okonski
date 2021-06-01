import com.console_engine.ConsoleEngine;
import com.players.IPlayer;


public class Game {
    public static void main(String[] args) {
        IPlayer player1 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-1");
        ConsoleEngine.INSTANCE.displayBoard(player1);

        System.out.println("===================================================");
        IPlayer player2 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-2");
        ConsoleEngine.INSTANCE.displayBoard(player2);
    }

}
