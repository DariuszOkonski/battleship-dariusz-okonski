import com.console_engine.ConsoleEngine;
import com.players.IPlayer;


public class Game {
    private IPlayer player1;
    private IPlayer player2;

    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }

    private void runGame() {
        String response;

        do {

            response = ConsoleEngine.INSTANCE.gameMenu();
            System.out.println("Response: " + response);


            differentGameModes(response);


            response = "Q";
        } while (!response.equals("Q"));


        System.out.println("Summary ===============================================");
        System.out.println(this.player1);
        System.out.println("================2");
        System.out.println(this.player2);

        // runSingleGame

        // checkendgame

        // repeat y/n
    }

    private void differentGameModes(String choice) {

        switch (choice) {
            case "1":
                this.player1 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-1", false);
                this.player2 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-2", false);
                break;
            case "2":
                this.player1 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-1", true);
                this.player2 = ConsoleEngine.INSTANCE.createPlayerBoardsAndShipsList("PLAYER-2", true);
                break;
            default:
                System.exit(0);
                break;
        }
    }

    private void runSingleGame() {

    }

}
