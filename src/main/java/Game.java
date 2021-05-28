import com.inout.ConsoleInOut;
import com.inout.Input;
import com.players.Board;
import com.ships.*;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {


//        Board player1Board = ConsoleInOut.INSTANCE.createPlayerBoard();
//
//        player1Board.printBoard();

        Input input = new Input();

        var result = input.getCoordinates();
        System.out.println(Arrays.toString(result));
    }

}
