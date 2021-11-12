package HW2;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {


        Scanner numb = new Scanner(System.in);
        System.out.println("Введите число");
        int number = numb.nextInt();
        if (number % 2 != 0) {
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

