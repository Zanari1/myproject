package HW2;
import java.util.Scanner;
public class WhichNumberIsGreater {
    public static void main(String[] args) {

        Scanner Numb1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = Numb1.nextInt();
        Scanner Numb2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        int number2 = Numb2.nextInt();
        if(number1 > number2){
            System.out.println("The " +  number1 + " has the greatest value");
        }else {
            System.out.println("The " + number2 + " has the greatest value");
        }
    }
}

//        4.Написать программу, которая сравнивает два числа типа
//        int и определяет, какое из чисел большее, а какое меньшее.
//        Программа должна вывести что-то типа “The number x has the
//        greatest value”. Где “x” одно из чисел

