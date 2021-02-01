package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestDaphne {
    @Test
    public void singleNumberDaphne() {
        RomanNumeral roman = new RomanNumeral();
        String input = "X";
        Assertions.assertEquals(10, roman.convertDaphne(input));
    }

    @Test
    public void doubleNumberAdditiveDaphne() {
        RomanNumeral roman = new RomanNumeral();
        String input = "XV";
        Assertions.assertEquals(15, roman.convertDaphne(input));
    }

    @Test
    public void doubleNumberSubtractDaphne() {
        RomanNumeral roman = new RomanNumeral();
        String input = "IX";
        Assertions.assertEquals(9, roman.convertDaphne(input));
    }

    @Test
    public void tripleNumberAddAndSubtractDaphne() {
        RomanNumeral roman = new RomanNumeral();
        String input = "XIV";
        Assertions.assertEquals(14, roman.convertDaphne(input));
    }

    @Test
    public void moreNumbers() {
        RomanNumeral roman = new RomanNumeral();
        String input = "VIII";
        Assertions.assertEquals(8, roman.convertDaphne(input));
    }

    @Test
    public void wrongInput() {
        RomanNumeral roman = new RomanNumeral();
        String input = "VX";
        Assertions.assertEquals(-1, roman.convertDaphne(input));
    }

    @Test
    public void wrongInput2() {
        RomanNumeral roman = new RomanNumeral();
        String input = "XXC";
        Assertions.assertEquals(-1, roman.convertDaphne(input));
    }

    @Test
    public void wrongInput3() {
        RomanNumeral roman = new RomanNumeral();
        String input = "A";
        Assertions.assertEquals(-1, roman.convertDaphne(input));
    }


}