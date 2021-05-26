import com.inout.ConsoleInOut;

public class Game {
    public static void main(String[] args) {
        System.out.println("Hello Battleship");
        ConsoleInOut.INSTANCE.getDisplay();
        System.out.println(ConsoleInOut.getInstance());
    }

}
