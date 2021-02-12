package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void onlyOneWordDoesMatch() {
        int words = new CountLetters().count("catr");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void onlyOneWordDoesNotMatch() {
        int words = new CountLetters().count("cat");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void multipleWordsFirstEndsWithr() {
        int words = new CountLetters().count("catr!dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void onlySecondWordMatches() {
        int words = new CountLetters().count("cat!dogs");
        Assertions.assertEquals(1, words);
    }

}