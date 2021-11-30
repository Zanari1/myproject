package HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class CountWordLeng {

        public static void main(String[] args){
            String input = "Hello world Java 7 lessons lessons lessons";
           CountWord(input);
        }

        public static void CountWord(String args) {
            String input = "Hello world Java 7 lessons lessons lessons";
            String[] words = input.split("\\s+");
            Integer[][] counters = new Integer[][]{};

            for(int i=0; i < words.length; i++)  {
                int repeatableWords = 0;
                int wordLength = words[i].length();

                for (int j=0; j < words.length; j++) {
                    if (wordLength == words[j].length()) {
                        repeatableWords++;
                        words[j] = "";
                    }
                }
                if (wordLength != 0) {
                    System.out.println("Word length: " + wordLength + ", words count: " + repeatableWords);
                }
            }
        }
        }











