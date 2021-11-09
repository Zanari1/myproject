package HM;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        //Программа для вычисления индекса массы тела (Имперская система).
        double a;
        double b;
        try (Scanner NMP = new Scanner(System.in)) {
            System.out.println("Введите вес в фунтах");
            a = NMP.nextDouble();
            System.out.println("Введите рост в дюймах");
            b = NMP.nextDouble();
            System.out.println((a / Math.pow(b, 2)) *703);
        }



        }
    }