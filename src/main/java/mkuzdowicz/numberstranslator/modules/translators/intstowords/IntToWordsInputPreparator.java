package mkuzdowicz.numberstranslator.modules.translators.intstowords;


import java.util.*;
import java.util.stream.IntStream;


public class IntToWordsInputPreparator {

    /* TOKENIZATION SCHEMA 000-##-000-##-000-##-000 */

    private final static int FOUR_BYTE_NUM_LENGTH = 10;
    private final static int FOUR_BYTE_NUM_MASK_LENGTH = FOUR_BYTE_NUM_LENGTH + 2;
    private final static String DELIMITER = "-##-";


    public List<String> prepareAsIntTokensList(final int num) {

        final String numWithMask = applyMask(num);
        final String preparedData = applyDelimiter(numWithMask);

        return Arrays.asList(preparedData.split(DELIMITER));
    }

    private String applyMask(final int num) {
        final StringBuilder sb = new StringBuilder();
        final String numAsStr = Integer.toString(num);
        final int maskLength = FOUR_BYTE_NUM_MASK_LENGTH - numAsStr.length();
        IntStream.range(0, maskLength).forEach(i -> sb.append("0"));
        sb.append(numAsStr);
        return sb.toString();
    }

    private String applyDelimiter(final String numWithMask) {

        final char[] numWithMaskCharArr = numWithMask.toCharArray();
        final StringBuilder sb = new StringBuilder();

        IntStream.range(0, numWithMaskCharArr.length).forEach(i -> {
            sb.append(numWithMaskCharArr[i]);
            if ((i + 1) % 3 == 0 && i != numWithMaskCharArr.length - 1) {
                sb.append(DELIMITER);
            }
        });
        return sb.toString();
    }

}
