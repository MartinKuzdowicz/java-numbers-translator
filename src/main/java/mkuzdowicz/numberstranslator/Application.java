package mkuzdowicz.numberstranslator;

import mkuzdowicz.numberstranslator.modules.translators.intstowords.IntToWordsTranslator;
import mkuzdowicz.numberstranslator.modules.translators.romanstoints.RomansToIntTranslator;

public class Application {

    public static void main(String[] args) {

        IntToWordsTranslator intToWordsTranslator = new IntToWordsTranslator();

        System.out.println("--------------------------------------------------");
        System.out.println("Exersize Nr 1 int to words");
        System.out.println("--------------------------------------------------");

        System.out.println("1123 => " + intToWordsTranslator.translate(1123));
        System.out.println("5 => " + intToWordsTranslator.translate(5));
        System.out.println("0 => " + intToWordsTranslator.translate(0));
        System.out.println("101 => " + intToWordsTranslator.translate(101));
        System.out.println("90 => " + intToWordsTranslator.translate(90));
        System.out.println("25 => " + intToWordsTranslator.translate(25));
        System.out.println("145 => " + intToWordsTranslator.translate(145));
        System.out.println("116 => " + intToWordsTranslator.translate(116));
        System.out.println("-768 => " + intToWordsTranslator.translate(-786));
        System.out.println("2786 => " + intToWordsTranslator.translate(2786));
        System.out.println("222786 => " + intToWordsTranslator.translate(222786));
        System.out.println("82786 => " + intToWordsTranslator.translate(82786));
        System.out.println("1000000 => " + intToWordsTranslator.translate(1000000));
        System.out.println("4030045 => " + intToWordsTranslator.translate(4030045));
        System.out.println("1000070 => " + intToWordsTranslator.translate(1000070));
        System.out.println("100070 => " + intToWordsTranslator.translate(100070));
        System.out.println("-1000075 => " + intToWordsTranslator.translate(-1000075));
        System.out.println("1000000000 => " + intToWordsTranslator.translate(1000000000));
        System.out.println("1000500000 => " + intToWordsTranslator.translate(1000500000));
        System.out.println("2000500005 => " + intToWordsTranslator.translate(2000500005));

        System.out.println();

        RomansToIntTranslator romansToIntTranslator = new RomansToIntTranslator();

        System.out.println("--------------------------------------------------");
        System.out.println("Exersize Nr 2 Roman numerals to int");
        System.out.println("--------------------------------------------------");

        System.out.println("III => " + romansToIntTranslator.translate("III"));
        System.out.println("IV => " + romansToIntTranslator.translate("IV"));
        System.out.println("XXV => " + romansToIntTranslator.translate("XXV"));
        System.out.println("XL => " + romansToIntTranslator.translate("XL"));
        System.out.println("XC => " + romansToIntTranslator.translate("XC"));
        System.out.println("DCCIV => " + romansToIntTranslator.translate("DCCIV"));
        System.out.println("XXIX => " + romansToIntTranslator.translate("XXIX"));
        System.out.println("LXX => " + romansToIntTranslator.translate("LXX"));
        System.out.println("DL => " + romansToIntTranslator.translate("DL"));
        System.out.println("XCIV => " + romansToIntTranslator.translate("XCIV"));
        System.out.println("CM => " + romansToIntTranslator.translate("CM"));
        System.out.println("DI => " + romansToIntTranslator.translate("DI"));

    }

}
