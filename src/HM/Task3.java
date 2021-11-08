package HM;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Программа для вычисления индекса массы тела (Имперская система).
        double a;
        double b;
        try (Scanner NMP = new Scanner(System.in)) {
            System.out.println("Введите рост в дюймах");
            a = NMP.nextDouble();
            System.out.println("Введите вес в фунтах");
            b = NMP.nextDouble();
            System.out.println((b / Math.pow(a, 2)) *703);
        }



        }
    }