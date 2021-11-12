package HW2;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите значени a : ");
        double a = input.nextDouble();
        System.out.print("Введите значение b : ");
        double b = input.nextDouble();

        if (b == 0 | a == 0) {
            System.out.println("x = 0");
        }
        else{
            System.out.println("x = "+ -b/a);
        }
    }

    }

//        5.Написать программу, которая бы решала уравнение вида a * x + b = 0
//        Переменные a и b можно задать вручную. Далее нужно будет посчитать и
//        вывести значение “х”. Программа должна также учитывать варианты, когда
//        или а = 0 или b = 0


