package example.codeclan.com.hangman;

import java.util.ArrayList;

/**
 * Created by user on 28/06/2017.
 */

public class AnswerWord {

    private String answer;

    public AnswerWord(String answer){
        this.answer = answer;
    }

    public void makeSpace(){
        int i;
        for(i=0; i<50; i++){
            System.out.println("|");
        }

        System.out.println("STOP CHEATING!");

        for(i=0; i<50; i++){
            System.out.println("|");
        }

    }

    public String getAnswer() {
        return this.answer;
    }

    public String convertAnswer(){
        StringBuilder blankAnswer = new StringBuilder(this.answer);
        for(int i=0; i<this.answer.length(); i++){
            blankAnswer.setCharAt(i, '_');
        }
        return blankAnswer.toString();
    }

    public String guessLetter(ArrayList<Character> guesses){
        StringBuilder answer = new StringBuilder(this.answer);
        for (char guessed: guesses){
            int location = answer.indexOf(Character.toString(guessed));
            for(int i=0; i<this.answer.length(); i++){
                if(i == location){
                    answer.setCharAt(i, guessed);
                }else if(!guesses.contains(answer.charAt(i))){
                    answer.setCharAt(i, '_');
                }
            }
        }
        return answer.toString();
    }

    public boolean wordComplete(String guessed){
        if(guessed.contains("_")){
         return false;
        }else{
            return true;
        }
    }
}
