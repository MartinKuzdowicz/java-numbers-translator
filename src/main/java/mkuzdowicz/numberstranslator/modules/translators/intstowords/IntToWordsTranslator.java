package mkuzdowicz.numberstranslator.modules.translators.intstowords;

import mkuzdowicz.numberstranslator.modules.dictionaries.IntegersToWordsDictionary;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntToWordsTranslator {

    private final IntToWordsInputPreparator inputPreparator = new IntToWordsInputPreparator();
    private final IntegersToWordsDictionary integersToWordsDictionary = new IntegersToWordsDictionary();
    private final Map<Integer, String> indexToIntegeTokenType;
    private final String AND_CONJUNCTION = "and";
    private final String MINUS_PREFIX = "minus" + StringUtils.SPACE;

    public IntToWordsTranslator() {
        indexToIntegeTokenType = new HashMap<>();
        indexToIntegeTokenType.put(0, "billion");
        indexToIntegeTokenType.put(1, "million");
        indexToIntegeTokenType.put(2, "thousand");
        indexToIntegeTokenType.put(3, "hundred");
    }

    public String translate(final int initialNum) {

        if (initialNum == 0) {
            return simpleMapToWords(initialNum);
        }

        final int absValNum = Math.abs(initialNum);

        final List<String> intTokens = inputPreparator.prepareAsIntTokensList(absValNum);

        final String wordsResult = intTokens.stream()
                .map(token -> handleIntToWordsMapping(token, intTokens.indexOf(token)))
                .collect(Collectors.joining(StringUtils.SPACE));

        return handlePositiveOrNegativeInt(initialNum, normalizeFinalResult(wordsResult));
    }

    private String normalizeFinalResult(final String wordsToNormalize) {

        final String withValidSpaces = StringUtils.normalizeSpace(wordsToNormalize);

        if (StringUtils.startsWith(withValidSpaces, AND_CONJUNCTION)) {
            return StringUtils.removeStart(withValidSpaces, AND_CONJUNCTION).trim();
        }

        return withValidSpaces;
    }

    private String handlePositiveOrNegativeInt(final int initialNum, final String numAsWords) {
        return initialNum < 0 ? MINUS_PREFIX + numAsWords : numAsWords;
    }

    private String handleIntToWordsMapping(final String intToken, final int unitNameIdx) {

        final int num = Integer.parseInt(intToken);
        final boolean thisIsLastToken = unitNameIdx == 3;
        final String unitName = indexToIntegeTokenType.get(unitNameIdx);

        if (num == 0) {
            return StringUtils.EMPTY;
        }

        if (thisIsLastToken) {
            return mapToWordsFull3DigitToken(intToken);
        }

        return Stream.of(mapToWordsFull3DigitToken(intToken), unitName)
                .collect(Collectors.joining(StringUtils.SPACE));

    }

    private String mapToWordsFull3DigitToken(final String intToken) {
        final int num = Integer.parseInt(intToken);

        if (num == 0) {
            return "";
        }

        final String[] digits = intToken.split(StringUtils.EMPTY);
        final int hundredsUnit = Integer.parseInt(digits[0]);
        final String tensAndOnesToken = digits[1] + digits[2];

        if (hundredsUnit == 0) {
            return mapToWordsTensAndOnesUnit(tensAndOnesToken);
        }

        final String hundredAsWord = indexToIntegeTokenType.get(3);

        return Stream.of(
                simpleMapToWords(hundredsUnit),
                hundredAsWord,
                mapToWordsTensAndOnesUnit(tensAndOnesToken))
                .collect(Collectors.joining(StringUtils.SPACE));

    }

    private String withAndSeparatorIfAllowed(final String tensAndOnesToken) {

        final int tensAndOnesVal = Integer.parseInt(tensAndOnesToken);

        return tensAndOnesVal > 0 ? AND_CONJUNCTION : StringUtils.EMPTY;

    }


    private String mapToWordsTensAndOnesUnit(final String tensOnesToken) {

        final int num = Integer.parseInt(tensOnesToken);

        if (num == 0) {
            return StringUtils.EMPTY;
        }

        if (num < 19) {
            return Stream.of(
                    withAndSeparatorIfAllowed(tensOnesToken),
                    simpleMapToWords(num))
                    .collect(Collectors.joining(StringUtils.SPACE));
        }

        final String[] digits = tensOnesToken.split(StringUtils.EMPTY);
        final int tensDigit = Integer.parseInt(digits[0] + "0");
        final int onesDigit = Integer.parseInt(digits[1]);
        if (onesDigit > 0) {
            return Stream.of(
                    withAndSeparatorIfAllowed(tensOnesToken),
                    simpleMapToWords(tensDigit),
                    simpleMapToWords(onesDigit))
                    .collect(Collectors.joining(StringUtils.SPACE));
        }
        return Stream.of(
                withAndSeparatorIfAllowed(tensOnesToken),
                simpleMapToWords(tensDigit))
                .collect(Collectors.joining(StringUtils.SPACE));
    }

    private String simpleMapToWords(final int num) {
        return integersToWordsDictionary.mapToWord(num);
    }


}
