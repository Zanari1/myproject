package HW6;

import java.util.Scanner;

public class FractionNumbers {
    public static void main(String[] args) {
        System.out.println("Введите первое значение ");
        int numb1 = takeIntFromScanner();

    }
    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
