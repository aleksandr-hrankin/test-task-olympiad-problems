package one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BracketsTest {
    private static final Brackets BRACKETS = new Brackets();
    private static final int COUNT_OF_TEST = 100;

    @Test
    public void countOnePairBracketsTest() {
        int expected = 1;
        int actual = BRACKETS.countAmount("()");
        assertEquals(expected, actual);
    }

    @Test
    public void openBracketTest() {
        int expected = 0;
        int actual = BRACKETS.countAmount("(");
        assertEquals(expected, actual);
    }

    @Test
    public void closeBracketTest() {
        int expected = 0;
        int actual = BRACKETS.countAmount(")");
        assertEquals(expected, actual);
    }

    @Test
    public void onePairAndOpenBracketTest() {
        int expected = 1;
        int actual = BRACKETS.countAmount("()(");
        assertEquals(expected, actual);
    }

    @Test
    public void onePairAndCloseBracketTest() {
        int expected = 1;
        int actual = BRACKETS.countAmount("())");
        assertEquals(expected, actual);
    }

    @Test
    public void emptyTest() {
        int expected = 0;
        int actual = BRACKETS.countAmount("");
        assertEquals(expected, actual);
    }

    @Test
    public void nestedBracketsTest() {
        int expected = 2;
        int actual = BRACKETS.countAmount("(())");
        assertEquals(expected, actual);
    }

    @Test
    public void openCloseTest() {
        int expected = 0;
        int actual = BRACKETS.countAmount(")(");
        assertEquals(expected, actual);
    }

    @Test
    public void manyPairsTest() {
        int expected;
        int actual;
        String pairBracket = "()";
        for (int i = 0; i < COUNT_OF_TEST; i++) {
            String equation = pairBracket.repeat(i);
            expected = i;
            actual = BRACKETS.countAmount(equation);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void manyAttachmentsTest() {
        int expected;
        int actual;
        String openBracket = "(";
        String closeBracket = ")";
        for (int i = 0; i < COUNT_OF_TEST; i++) {
            String equation = openBracket.repeat(i);
            equation += closeBracket.repeat(i);
            expected = i;
            actual = BRACKETS.countAmount(equation);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void incorrectEquationTest() {
        int expected = 0;
        int actual = BRACKETS.countAmount("*$#*HNKNK(@@*#");
        assertEquals(expected, actual);
    }

    @Test
    public void incorrectEquationWithPairBracketsInMeddleTest() {
        int expected = 1;
        int actual = BRACKETS.countAmount("*$#*HN()KNK(@@*#");
        assertEquals(expected, actual);
    }

    @Test
    public void incorrectEquationWithPairBracketsOutsideTest() {
        int expected = 1;
        int actual = BRACKETS.countAmount("(*$#*HN(KNK(@@*#)");
        assertEquals(expected, actual);
    }
}
