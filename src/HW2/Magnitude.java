package HW2;
import java.util.Scanner;
public class Magnitude {
    public static void main(String[] args) {


        System.out.println("Введите первое число");
        int number1 = takeIntFromScanner();
        System.out.println("Введите второе число");
        int number2 = takeIntFromScanner();
        magnitude(number1, number2);
    }
    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static void magnitude (int int1, int int2)  {
        if (Math.abs(int1) > Math.abs(int2)) {
            System.out.println("The " + int1 + " has the greatest magnitude");
        } else {
            System.out.println("The " + int2 + " has the greatest magnitude");
        }

    }

}
//      6.Написать программу которая будет сравнивать величину
//      (magnitude) двух чисел. Например, если одно число = 3,
//      а второе число = -9, программа должна выдать, что число
//      -9 имеет большую величину.



