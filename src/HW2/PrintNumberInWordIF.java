package HW2;
import java.util.Scanner;
public class PrintNumberInWordIF {



    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = takeIntFromScanner();
        condition(number);
    }
    public static void condition(int number) {
        if (number == 1) {
            System.out.println("One");
        } if (number == 2) {
            System.out.println("Two");
        } if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        }else {
            System.out.println("Other");
        }
    }
    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}


//        3.Написать программу с названием “PrintNumberInWord”, которая напечатает
//        “ONE”, “TWO”, ..., “NINE”, “OTHER” если переменная “number” типа int будет
//        1, 2, 3, 4, ... 9, или любой другой. Решить задачу двумя способами:
//        1) с использованием if..else if
//        2) с использованием switch-case
