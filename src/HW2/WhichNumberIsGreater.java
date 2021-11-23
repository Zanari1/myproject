package HW2;
import java.util.Scanner;
public class WhichNumberIsGreater {
    public static void main(String[] args) {

        System.out.println("Введите первое число");
        int number1 = takeIntFromScanner();
        System.out.println("Введите второе число");
        int number2 = takeIntFromScanner();
        greaterNumb(number1,number2);

    }
    public static void greaterNumb(int number1, int number2){
        if(number1 > number2){
            System.out.println("The " +  number1 + " has the greatest value");
        }else {
            System.out.println("The " + number2 + " has the greatest value");
        }
    }
    public static Integer takeIntFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}

//        4.Написать программу, которая сравнивает два числа типа
//        int и определяет, какое из чисел большее, а какое меньшее.
//        Программа должна вывести что-то типа “The number x has the
//        greatest value”. Где “x” одно из чисел

