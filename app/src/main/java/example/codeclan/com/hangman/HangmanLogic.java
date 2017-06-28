package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class HangmanLogic {

    public void playGame(AnswerWord answer, LetterPicker letterplayer) {

    boolean gameisFinished = !answer.wordComplete(answer.guessLetter(letterplayer.getGuesses()));

        while (letterplayer.getLives() > 0 && !gameisFinished) {
            letterplayer.pickLetter(answer);
            System.out.println(answer.guessLetter(letterplayer.getGuesses()));

        if (letterplayer.getLives() == 0) {
            System.out.println("Out of lives!");
            System.out.println("The correct answer was:");
            System.out.println(answer.getAnswer());
            System.exit(0);
        }

        if (!answer.guessLetter(letterplayer.getGuesses()).contains("_")) {
            System.out.println("You won!");
            System.out.println("The correct answer was:");
            System.out.println(answer.getAnswer());
            System.exit(0);
        }

    }
}

    public AnswerWord pickAnswerWord(WordChooser wordplayer){
        AnswerWord word = new AnswerWord(wordplayer.chooseWord());
        return word;
    }

    public boolean checkNotBlank(String input){
        return (input.length() != 0);
    }
}
