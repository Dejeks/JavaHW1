package org.example.Homework.HW1;
import java.util.Scanner;

public class Task1 {
    public static String reverseWords(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String reversedWords = reverseWords(s);
        System.out.println(reversedWords);
    }
}
