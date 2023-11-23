import org.example.Utilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTests {
    @ParameterizedTest
    @ValueSource(ints = {1,3,7,11,711,-5,-51})
    public void testIsOddTrue(int number) {
        var expected = true;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,100,-8,-512})
    public void testIsOddFalse(int number) {
        var expected = true;
        var actual = Utilities.numberIsOdd(number);

        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"1", "Lin us","aws","jaws" })
    public static boolean stringIsBlank(String input){
        return input == null || input.trim().isEmpty();
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testStringIsBlankNull(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,15,25,30,-1})
    public void testGetNoiseLevelLow(int decibel){
        var expected = Level.LOW
    }
}
