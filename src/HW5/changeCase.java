package HW5;

import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {

        String str1= takeStringFromScanner();
        StringBuffer newStr= new StringBuffer(str1);

        for(int i = 0; i < str1.length(); i++) {
            if(Character.isLowerCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            else if(Character.isUpperCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("Текст после измения регистра : " + newStr);
    }
    public static String takeStringFromScanner() {
        System.out.println("Введите текст ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}