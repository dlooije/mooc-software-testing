package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "string = {0}")
    @CsvSource({"gg", "aggg", "aggaggaggb", "a"})
    public void testHappyG(String inp) {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy(inp));
    }

    @ParameterizedTest(name = "string = {0}, happyg = {1}")
    @CsvSource({"g", "aggaga", "aggaggaggbg"})
    public void testNonHappyG(String inp) {
        GHappy gHappy = new GHappy();
        Assertions.assertFalse(gHappy.gHappy(inp));
    }
}
