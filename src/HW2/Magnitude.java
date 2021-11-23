package HW2;
import java.util.Scanner;
public class Magnitude {
    public static void main(String[] args) {


        System.out.println("Введите первое число");
        int number1 = takeIntFromScanner();
        System.out.println("Введите второе число");
        int number2 = takeIntFromScanner();
        if (Math.abs(number1) > Math.abs(number2)) {
            System.out.println("The " + number1 + " has the greatest magnitude");
        } else {
            System.out.println("The " + number2 + " has the greatest magnitude");
        }

    }

    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
//      6.Написать программу которая будет сравнивать величину
//      (magnitude) двух чисел. Например, если одно число = 3,
//      а второе число = -9, программа должна выдать, что число
//      -9 имеет большую величину.



