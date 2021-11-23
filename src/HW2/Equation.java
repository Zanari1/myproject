package HW2;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {


        System.out.print("Введите значени a : ");
        double a = takeDoubleFromScanner();
        System.out.print("Введите значение b : ");
        double b = takeDoubleFromScanner();
            if (b == 0 | a == 0) {
            System.out.println("x = 0");
        }
        else{
            System.out.println("x = "+ -b/a);
        }
    }
    public static Double takeDoubleFromScanner(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    }

//        5.Написать программу, которая бы решала уравнение вида a * x + b = 0
//        Переменные a и b можно задать вручную. Далее нужно будет посчитать и
//        вывести значение “х”. Программа должна также учитывать варианты, когда
//        или а = 0 или b = 0


