package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 28/06/2017.
 */

public class HangmanTest {

    private AnswerWord answerword;
    private LetterPicker player;

    @Before
    public void before(){
        answerword = new AnswerWord("hangman");
        player = new LetterPicker();
    }

    @Test
    public void testConvertToBlankString(){
        assertEquals("_______", answerword.convertAnswer());
    }

    @Test
    public void testStoreLetters(){
        player.addGuess('g');
        player.addGuess('h');
        assertEquals(2, player.getGuesses().size());

    }

    @Test
    public void testConvertGuessedLetter() {
        player.addGuess('h');
        assertEquals("h______", answerword.guessLetter(player.getGuesses()));
    }

    @Test
    public void testConvertSomeGuessedLetters() {
        player.addGuess('h');
        player.addGuess('g');
        player.addGuess2('p', answerword.getAnswer());
        player.addGuess('n');
        player.addGuess('m');
        assertEquals(5, player.getLives());
        assertEquals("h_ngm_n", answerword.guessLetter(player.getGuesses()));
        assertEquals(false, answerword.wordComplete(player.getGuesses()));
    }


}
