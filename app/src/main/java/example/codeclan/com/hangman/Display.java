package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Display {

    public void Display(int lives) {
        if (lives == 0) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println("/|\\  |");
            System.out.println("/ \\  |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 1) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println("/|\\  |");
            System.out.println("/    |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 2) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println("/|\\  |");
            System.out.println("     |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 3) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println("/|   |");
            System.out.println("     |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 4) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println(" |   |");
            System.out.println("     |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 5) {
            System.out.println(" +---+");
            System.out.println(" |   |");
            System.out.println(" O   |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     | ");
            System.out.println("=======");
        } else if (lives == 6) {
            System.out.println(" +---+");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     | ");
            System.out.println("=======");
        }
    }
}
