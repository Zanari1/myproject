package HW2;
import java.util.Scanner;
public class Magnitude {
    public static void main(String[] args) {

        Scanner Numb1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = Numb1.nextInt();
        Scanner Numb2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        int number2 = Numb2.nextInt();
        if(Math.abs(number1) > Math.abs(number2)){
            System.out.println("The " +  number1 + " has the greatest magnitude");
        }else {
            System.out.println("The " + number2 + " has the greatest magnitude");
        }

    }
}
//      6.Написать программу которая будет сравнивать величину
//      (magnitude) двух чисел. Например, если одно число = 3,
//      а второе число = -9, программа должна выдать, что число
//      -9 имеет большую величину.



