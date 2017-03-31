import etc.Game;

import java.util.Scanner;

/**
 * Created by Hrant on 29.03.2017.
 */
public class Main {
    public static void main(String[] args)  throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bard height:");
        int boardHeight = scanner.nextInt();
        System.out.print("Input bard width:");
        int boardWidth = scanner.nextInt();

        Game game = new Game(boardHeight , boardWidth);
        game.start();
    }
}
