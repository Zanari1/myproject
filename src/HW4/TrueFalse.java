package HW4;

import java.util.Scanner;

public class TrueFalse {

    public static void main(String[] args) {

        System.out.println("Введите число");
        int number1 = takeIntFromScanner();
        System.out.println(isOdd(number1));
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}