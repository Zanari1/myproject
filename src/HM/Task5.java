package HM;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Дюймы в метрах (вводные данные (один дюйм равен 0,0254 метра)).
        double d;
        try (Scanner duim = new Scanner(System.in)) {
            System.out.println("Введите растояние  в дюймах");
            d = duim.nextDouble();
            System.out.println("Растояние в Метрах " + (d * 0.0254));
        }


         }
    }


