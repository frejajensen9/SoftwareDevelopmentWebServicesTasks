import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testEmptyString() {
        var sc = new StringCalculator();
        assertEquals(0,sc.add(""));
    }

    @Test
    void testOneNumber() {
        var sc = new StringCalculator();
        assertEquals(12,sc.add("12"));
    }

    @Test
    void testTwoNumber() {
        var sc = new StringCalculator();
        assertEquals(24,sc.add("12,12"));
    }

    @Test
    void testMoreNumbers() {
        var sc = new StringCalculator();
        assertEquals(36,sc.add("12,12,12"));
    }

    @Test
    void testNewline() {
        var sc = new StringCalculator();
        assertEquals(6,sc.add("1\n2,3"));
    }

    @Test
    void testException() {
        var sc = new StringCalculator();
        assertEquals("Negative number entered",sc.add("2,-1"));
    }
}