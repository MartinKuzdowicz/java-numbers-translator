package mkuzdowicz.numberstranslator.modules.dictionaries;

import java.util.HashMap;
import java.util.Map;

public class IntegersToWordsDictionary {

    private final Map<Integer, String> dictionary = new HashMap<>();

    public IntegersToWordsDictionary() {

        dictionary.put(new Integer(0), "zero");
        dictionary.put(new Integer(1), "one");
        dictionary.put(new Integer(2), "two");
        dictionary.put(new Integer(3), "three");
        dictionary.put(new Integer(4), "four");
        dictionary.put(new Integer(5), "five");
        dictionary.put(new Integer(6), "six");
        dictionary.put(new Integer(7), "seven");
        dictionary.put(new Integer(8), "eigth");
        dictionary.put(new Integer(9), "nine");

        dictionary.put(new Integer(10), "ten");
        dictionary.put(new Integer(11), "ileven");
        dictionary.put(new Integer(12), "twelve");
        dictionary.put(new Integer(13), "thirteen");
        dictionary.put(new Integer(14), "forteen");
        dictionary.put(new Integer(15), "fifteen");
        dictionary.put(new Integer(16), "sixteen");
        dictionary.put(new Integer(17), "seventeen");
        dictionary.put(new Integer(18), "eigthteen");
        dictionary.put(new Integer(19), "nineteen");

        dictionary.put(new Integer(20), "twenty");
        dictionary.put(new Integer(30), "thirty");
        dictionary.put(new Integer(40), "forty");
        dictionary.put(new Integer(50), "fifty");
        dictionary.put(new Integer(60), "sixty");
        dictionary.put(new Integer(70), "seventy");
        dictionary.put(new Integer(80), "eigthy");
        dictionary.put(new Integer(90), "ninety");

    }

    public String mapToWord(final int num) {
        return dictionary.get(num);
    }

}
