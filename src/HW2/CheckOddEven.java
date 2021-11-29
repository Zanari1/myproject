package HW2;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {



        System.out.println("Введите число");
        int number = takeIntFromScanner();
        oddOrEven(number);
    }
    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void oddOrEven(int someInt) {
        if (someInt % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE");
    }
}

//        2.Написать программу с названием “CheckOddEven”,
//        которая печатает “Odd Number” если переменная “number”
//        типа int нечетная. Или “Even Number” если переменная четная.
//        Программа всегда должна перед выходом печатать “BYE”

