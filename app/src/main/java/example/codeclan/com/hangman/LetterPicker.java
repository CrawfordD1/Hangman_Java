package example.codeclan.com.hangman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class LetterPicker extends Player {

    private int lives;
    private Scanner sc;
    private ArrayList<Character> guesses;

    public LetterPicker(){
        this.lives = 6;
        sc = new Scanner(System.in);
        this.guesses = new ArrayList<Character>();
    }

    public int getLives() {
        return this.lives;
    }

    public void loseLife() {
        System.out.println("Sorry incorrect guess, try again!");
        this.lives -= 1;
        System.out.println("You have " + this.lives + " guesses left");
    }

    public ArrayList<Character> getGuesses(){
        return this.guesses;
    }

    public void addGuess(char input, String answer){
        if(this.guesses.contains(input) || !answer.contains(Character.toString(input))) {
            loseLife();
            addGuess2(input);
        }else{
            addGuess2(input);
        }

    }

    public void addGuess2(char input){
            this.guesses.add(input);
    }


    public char pickLetter(AnswerWord answer){
        System.out.println("Please pick a letter:");
        String input = sc.nextLine().toUpperCase();
        while(!input.matches("[a-zA-Z]+")){
            System.out.println("Please enter a valid character");
            input = sc.nextLine().toUpperCase();
        }
        char choice = input.charAt(0);
        addGuess(choice, answer.getAnswer());
        return choice;
    }
}
