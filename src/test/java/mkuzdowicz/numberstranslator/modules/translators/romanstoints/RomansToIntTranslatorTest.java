package mkuzdowicz.numberstranslator.modules.translators.romanstoints;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomansToIntTranslatorTest {

    private RomansToIntTranslator romansToIntTranslator;

    @Before
    public void prepare() {
        romansToIntTranslator = new RomansToIntTranslator();
    }

    @Test
    public void romansToIntTranslator_test_for_III() {
        final String given = "III";
        final int expected = 3;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_IV() {
        final String given = "IV";
        final int expected = 4;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_XXV() {
        final String given = "XXV";
        final int expected = 25;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_XL() {
        final String given = "XL";
        final int expected = 40;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_XC() {
        final String given = "XC";
        final int expected = 90;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_DCCIV() {
        final String given = "DCCIV";
        final int expected = 704;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_XXIX() {
        final String given = "XXIX";
        final int expected = 29;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_LXX() {
        final String given = "LXX";
        final int expected = 70;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_DL() {
        final String given = "DL";
        final int expected = 550;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_XCIV() {
        final String given = "XCIV";
        final int expected = 94;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_CM() {
        final String given = "CM";
        final int expected = 900;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void romansToIntTranslator_test_for_DI() {
        final String given = "DI";
        final int expected = 501;
        final int actual = romansToIntTranslator.translate(given);
        Assert.assertEquals(expected, actual);
    }




}