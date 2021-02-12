package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @Test
    public void TestShiftThree() {
        String result = cipher.CaesarShiftCipher("cde", 3);
        Assertions.assertEquals("fgh", result);
    }

    @Test
    public void TestShiftEndToStart() {
        String result = cipher.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void TestShiftNegative() {
        String result = cipher.CaesarShiftCipher("xyz", -1);
        Assertions.assertEquals("wxy", result);
    }

    @Test
    public void TestShiftNegativeStartToEnd() {
        String result = cipher.CaesarShiftCipher("abc", -2);
        Assertions.assertEquals("yza", result);
    }

    @Test
    public void TestInvalidInput() {
        String result = cipher.CaesarShiftCipher("Hello", 3);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void TestLargeShift() {
        String result = cipher.CaesarShiftCipher("abc", 27);
        Assertions.assertEquals("bcd", result);
    }

    @Test
    public void TestExactShift() {
        String result = cipher.CaesarShiftCipher("abc", 26);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void TestNegativeExactShift() {
        String result = cipher.CaesarShiftCipher("cde", -26);
        Assertions.assertEquals("cde", result);
    }

    @Test
    public void TestZerohift() {
        String result = cipher.CaesarShiftCipher("abc", 0);
        Assertions.assertEquals("abc", result);
    }
}
