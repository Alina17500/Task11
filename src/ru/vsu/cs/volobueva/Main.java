package ru.vsu.cs.volobueva;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String textResult = transformText(readStringFromConsole());
            System.out.println("Numbered text: " + textResult);
        }
    }

    public static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original text: ");
        return scanner.nextLine();
    }

    private static String transformText(String text) {
        String[] numberedText = makeListToStringArray(NumberingOfSentences.numberingOfSentences(text));
        return String.join("", numberedText);
    }

    private static String[] makeListToStringArray(List<String> list) {
        String[] array = new String[list.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
