import com.console_engine.ConsoleEngine;
import com.players.IPlayer;
import com.ships.ISquare;
import com.ships.SquareStatus;

import java.util.Arrays;


public class Game {
    private IPlayer player1;
    private IPlayer player2;

    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }

    private void runGame() {
        String choice;

        do {

            choice = ConsoleEngine.INSTANCE.gameMenu();
            System.out.println("Choice: " + choice);

            this.differentGameModes(choice);

            this.runSingleGame();

//            checkEndGame();

            choice = "Q";
        } while (!choice.equals("Q"));


//        System.out.println("Summary ===============================================");
//        System.out.println(this.player1);
//        System.out.println("================2");
//        System.out.println(this.player2);

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
        boolean isPlayer1Hitting = true;

        while (this.player1.isAnyShipsLeft() || this.player2.isAnyShipsLeft()) {
            if(isPlayer1Hitting) {
                singleTurn(this.player1, this.player2);

            } else {
                singleTurn(this.player2, this.player1);
            }

            isPlayer1Hitting = !isPlayer1Hitting;
        }
    }

    private void singleTurn(IPlayer attacker, IPlayer defender) {
        // attacker turn
        System.out.println("Attacking: " + attacker.getName());

        // diplay defender board
        System.out.println("Defender:");
        ConsoleEngine.INSTANCE.displayBoard(defender);

        // get coordinates to make shoot
        int [] coordinates = ConsoleEngine.INSTANCE.getInput().getCoordinates();
        int row = coordinates[0];
        int col = coordinates[1];

        // check coordinates on defender board
        ISquare currentObjectOnDefenderBoard = defender.getSingleSquareObjectFromPlayer(row, col);

        // if null or missed then create in this position new squere with status missed

        if(currentObjectOnDefenderBoard == null) {
            defender.setMissedShoot(row, col);
        }


        // if hit ship than mark that on board
        // mark that on shipsList as well
        //  check if ship is destroyed, if destroyed than remove from shipsList
        // if double hit same spot than loose shoot

    }

    private void checkEndGame() {
        if(this.player1.isAnyShipsLeft()) {
            ConsoleEngine.INSTANCE.getDisplay().displayWinner(player1.getName());
        } else if (this.player2.isAnyShipsLeft()) {
            ConsoleEngine.INSTANCE.getDisplay().displayWinner(player2.getName());
        }
    }

}
