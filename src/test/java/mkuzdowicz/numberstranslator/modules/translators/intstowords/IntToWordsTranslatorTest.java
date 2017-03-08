package mkuzdowicz.numberstranslator.modules.translators.intstowords;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IntToWordsTranslatorTest {

    private IntToWordsTranslator intToWordsTranslator;

    @Before
    public void prepare() {
        intToWordsTranslator = new IntToWordsTranslator();
    }

    @Test
    public void translateIntLt_10_Test_1() {
        final int given = 5;
        final String expected = "five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateZero_1() {
        final int given = 0;
        final String expected = "zero";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void translateIntLt_100_Test_1() {
        final int given = 90;
        final String expected = "ninety";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntLt_100_Test_2() {
        final int given = 25;
        final String expected = "twenty five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_100_Test_1() {
        final int given = 101;
        final String expected = "one hundred and one";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_100_Test_2() {
        final int given = 145;
        final String expected = "one hundred and forty five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_100_Test_3() {
        final int given = 116;
        final String expected = "one hundred and sixteen";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateNegativeIntGt_100_Test_1() {
        final int given = -786;
        final String expected = "minus seven hundred and eigthy six";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_100000_Test_1() {
        final int given = 1000000;
        final String expected = "one million";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000_Test_1() {
        final int given = 2786;
        final String expected = "two thousand seven hundred and eigthy six";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000_Test_2() {
        final int given = 222786;
        final String expected = "two hundred and twenty two thousand seven hundred and eigthy six";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000_Test_3() {
        final int given = 82786;
        final String expected = "eigthy two thousand seven hundred and eigthy six";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000_Test_4() {
        final int given = 1123;
        final String expected = "one thousand one hundred and twenty three";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void translateIntGt_1000000_Test_1() {
        final int given = 4030045;
        final String expected = "four million and thirty thousand and forty five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000000_Test_2() {
        final int given = 1000070;
        final String expected = "one million and seventy";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_1000000_Test_3() {
        final int given = -1000075;
        final String expected = "minus one million and seventy five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_10000_Test_1() {
        final int given = 100070;
        final String expected = "one hundred thousand and seventy";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_10000000_Test_1() {
        final int given = 1000000000;
        final String expected = "one billion";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_10000000_Test_2() {
        final int given = 1000500000;
        final String expected = "one billion five hundred thousand";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void translateIntGt_10000000_Test_3() {
        final int given = 2000500005;
        final String expected = "two billion five hundred thousand and five";
        final String actual = intToWordsTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

}