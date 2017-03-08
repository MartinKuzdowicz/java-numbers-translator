package mkuzdowicz.numberstranslator.modules.translators.romanstoints;

import mkuzdowicz.numberstranslator.modules.dictionaries.RomanNumeralsToIntegersDictionary;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class RomansToIntTranslator {

    private final RomanNumeralsToIntegersDictionary dictionary = new RomanNumeralsToIntegersDictionary();

    public int translate(final String romanNum) {

        List<String> romanNumsList = new ArrayList<String>(Arrays.asList(romanNum.split(StringUtils.EMPTY)));
        List<Integer> numsToSum = new ArrayList<>();

        IntStream.range(0, romanNumsList.size()).forEach(i -> {
            final int currentElVal = dictionary.mapToInt(romanNumsList.get(i));
            if (i + 1 < romanNumsList.size()) {
                final int nextElVal = dictionary.mapToInt(romanNumsList.get(i + 1));
                if (currentElVal < nextElVal) {
                    final int currentElValAsNegative = (currentElVal * -1);
                    numsToSum.add(currentElValAsNegative);
                } else {
                    numsToSum.add(currentElVal);
                }
            } else {
                numsToSum.add(currentElVal);
            }
        });

        return numsToSum.stream().reduce(0, Integer::sum);
    }

}
