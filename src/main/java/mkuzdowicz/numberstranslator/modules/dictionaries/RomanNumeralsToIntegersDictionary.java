package mkuzdowicz.numberstranslator.modules.dictionaries;


import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsToIntegersDictionary {

    private final Map<String, Integer> dictionary = new HashMap<>();

    public RomanNumeralsToIntegersDictionary() {
        dictionary.put("I", 1);
        dictionary.put("V", 5);
        dictionary.put("X", 10);
        dictionary.put("L", 50);
        dictionary.put("C", 100);
        dictionary.put("D", 500);
        dictionary.put("M", 1000);
    }

    public int mapToInt(final String romaNum) {
        return dictionary.get(romaNum.toUpperCase());
    }

}
