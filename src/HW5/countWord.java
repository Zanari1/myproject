package HW5;

import java.util.Scanner;

public class countWord {

    public static void main(String[] args) {
       String takeString = takeStringFromScanner();
        System.out.println( "В вашем тексте " + countWords(takeString)+ " слов");

    }
    public static int countWords(String s){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
    public static String takeStringFromScanner() {
        System.out.println("Введите текст ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    }
