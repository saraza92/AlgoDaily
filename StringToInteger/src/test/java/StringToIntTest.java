import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntTest {
    StringToInt stringToInt = new StringToInt();

    @Test
    @DisplayName("Test with 2 signs")
    public void testWith2Signs(){
        int expected = 0;
        int actual = stringToInt.myAtoi("+-12");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with 1 sign")
    public void testWith1Sign(){
        int expected = -12;
        int actual = stringToInt.myAtoi("-12");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with spaces")
    public void testWithSpaces(){
        int expected = 342;
        int actual = stringToInt.myAtoi("      +342   ");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with minimum Int")
    public void testWithMinInt(){
        int expected = Integer.MIN_VALUE;
        int actual = stringToInt.myAtoi("-121231231231233");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with only spaces")
    public void testWithOnlySpace(){
        int expected = 0;
        int actual = stringToInt.myAtoi("              ");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with only sign")
    public void testWithOnlySign(){
        int expected = 0;
        int actual = stringToInt.myAtoi("+");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with empty String")
    public void testWithEmptyString(){
        int expected = 0;
        int actual = stringToInt.myAtoi("");
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test with maximum Int")
    public void testWithMaxInt(){
        int expected = Integer.MAX_VALUE;
        int actual = stringToInt.myAtoi("2121231231231233");
        assertEquals(expected,actual);
    }

}
