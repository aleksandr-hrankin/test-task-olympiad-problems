package three;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialTest {
    private static final Factorial FACTORIAL = new Factorial();

    @Test
    public void countForZeroTest() {
        int expected = 1;
        int actual = FACTORIAL.sumDigitsInFactorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void countForOneTest() {
        int expected = 1;
        int actual = FACTORIAL.sumDigitsInFactorial(1);
        assertEquals(expected, actual);
    }

    @Test
    public void countForTenTest() {
        int expected = 27;
        int actual = FACTORIAL.sumDigitsInFactorial(10);
        assertEquals(expected, actual);
    }

    @Test
    public void countForHundredTest() {
        int expected = 648;
        int actual = FACTORIAL.sumDigitsInFactorial(100);
        assertEquals(expected, actual);
    }
}
