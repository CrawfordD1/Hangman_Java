package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Runner {


    public static void main(String[] args) {

        HangmanLogic game = new HangmanLogic();

        LetterPicker letterplayer = new LetterPicker();
        WordChooser wordplayer = new WordChooser();

        AnswerWord answer = game.pickAnswerWord(wordplayer);
         answer.makeSpace();
        System.out.println("The word is " + answer.getAnswer().length() + " letters long:");
        System.out.println(answer.convertAnswer());
        game.playGame(answer, letterplayer);

    }
}

