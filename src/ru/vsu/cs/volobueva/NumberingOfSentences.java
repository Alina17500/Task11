package ru.vsu.cs.volobueva;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberingOfSentences {
    public static List<String> numberingOfSentences(String originalText) {
        List<String> textList = splitTextIntoSentences(originalText);

        return putNumbers(textList);
    }

    private static List<String> splitTextIntoSentences(String text) {
        List<String> splitText = new ArrayList<>();
        Matcher matcher = Pattern.compile("[.?!]").matcher(text);
        int index = 0;

        while (matcher.find()) {
            splitText.add(text.substring(index, matcher.start()) + matcher.group());
            index = matcher.end();
        }

        return splitText;
    }

    private static List<String> putNumbers(List<String> textList) {
        List<String> resultTextList = new ArrayList<>();

        for (int row = 0; row < textList.size(); row++) {
            resultTextList.add(row, textList.get(row) + "[" + (row + 1) + "]");
        }

        return resultTextList;
    }
}