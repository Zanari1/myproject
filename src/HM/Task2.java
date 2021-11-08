package HM;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Калькулятор скорости
        double a;
        double b;
        double c;
        double d;
        try (Scanner NMP = new Scanner(System.in)) {
            System.out.println("Введите расстояние в метрах");
            a = NMP.nextDouble();
            System.out.println("Введите время (часы)");
            b = NMP.nextDouble();
            System.out.println("Введите время (минуты)");
            c = NMP.nextDouble();
            System.out.println("Введите время (секунды)");
            d = NMP.nextDouble();
            System.out.println("Скорость в м/c " + a / ((b  *60 *60) + (c *60) + d));
            System.out.println("Скорость в км/ч " +(+a / ((b  *60 *60) + (c *60) + d)) *3.6);

        }







    }
    }