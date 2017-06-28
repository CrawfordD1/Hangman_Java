package example.codeclan.com.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class WordChooser extends Player {

    private String pickedWord;
    private Scanner sc;

    public WordChooser(){
        sc = new Scanner(System.in);
    }

    public String chooseWord(){
        System.out.println("Please pick a single word!");
        String input = sc.nextLine().toUpperCase();
        while(!input.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid word (Letters only!)");
            input = sc.nextLine();
        }
        return input;
    }
}
