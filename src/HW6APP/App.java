package HW6APP;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double numb1 = takeDoubleFromScanner1();
        double numb2 = takeDoubleFromScanner2();
        String action = takeStringFromScanner();

        FractionNumbers calculator = new FractionNumbers(numb1, numb2);

        if (action.equals("*")) {
            calculator.multiplyCount();
        } else if (action.equals("+")) {
            calculator.plusCount();
        } else if (action.equals("-")) {
            calculator.minusCount();
        } else if (action.equals("/")) {
            calculator.divideCount();
        } else {
            System.out.println("Такого действия нету, попробуйте еще раз");
            main(args);
        }
        System.out.println(calculator.toString());
    }

    private static void calculate() {
        double numb1 = takeDoubleFromScanner1();
        double numb2 = takeDoubleFromScanner2();
        String action = takeStringFromScanner();

        FractionNumbers calculator = new FractionNumbers(numb1, numb2);

        if (action.equals("*")) {
            calculator.toString();
            calculator.multiplyCount();
        } else if (action.equals("+")) {
            calculator.plusCount();
        } else if (action.equals("-")) {
            calculator.minusCount();
        } else if (action.equals("/")) {
            calculator.divideCount();
        } else {
            System.out.println("Такого действия нету, попробуйте еще раз");
            calculate();
        }
    }

    public static Double takeDoubleFromScanner1() {
        System.out.println("Введите первое значение ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static Double takeDoubleFromScanner2() {
        System.out.println("Введите второе значение ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static String takeStringFromScanner() {
        System.out.println("Выберите действие: *, /, +, -  ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }


}





