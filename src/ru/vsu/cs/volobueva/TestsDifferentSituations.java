package ru.vsu.cs.volobueva;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TestsDifferentSituations {
    @Test
    public void testStandardSituation() throws FileNotFoundException {
        String originalText = readStringFromFile("TestCase/input01TestStandardSituation.txt");
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(originalText));
        String textForTest = String.join("", numberedText);
        String textResult = readStringFromFile("TestResult/outputResult01.txt");
        Assert.assertEquals(textResult, textForTest);
    }

    @Test
    public void testSituationWithoutPunctuationMarks() throws FileNotFoundException {
        String originalText = readStringFromFile("TestCase/input02TestSituationWithoutPunctuationMarks.txt");
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(originalText));
        String textForTest = String.join("", numberedText);
        String textResult = readStringFromFile("TestResult/outputResult02.txt");
        Assert.assertEquals(textResult, textForTest);
    }

    @Test
    public void testSituationWithPoem() throws FileNotFoundException {
        String originalText = readStringFromFile("TestCase/input03TestSituationWithPoem.txt");
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(originalText));
        String textForTest = String.join("", numberedText);
        String textResult = readStringFromFile("TestResult/outputResult03.txt");
        Assert.assertEquals(textResult, textForTest);
    }

    @Test
    public void testDirectSpeech() throws FileNotFoundException {
        String originalText = readStringFromFile("TestCase/input04TestDirectSpeech.txt");
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(originalText));
        String textForTest = String.join("", numberedText);
        String textResult = readStringFromFile("TestResult/outputResult04.txt");
        Assert.assertEquals(textResult, textForTest);
    }

    @Test
    public void testOnlyOneTypeOfPunctuationMark() throws FileNotFoundException {
        String originalText = readStringFromFile("TestCase/input05TestOnlyOneTypeOfPunctuationMark.txt");
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(originalText));
        String textForTest = String.join("", numberedText);
        String textResult = readStringFromFile("TestResult/outputResult05.txt");
        Assert.assertEquals(textResult, textForTest);
    }

    private static String readStringFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName), "UTF-8");
        return scanner.nextLine();
    }

    private static String[] makeListToStringArray(List<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
