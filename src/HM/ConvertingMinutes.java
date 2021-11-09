package HM;

import java.util.Scanner;

public class ConvertingMinutes {
    public static void main(String[] args) {

        //Программа для преобразования минут в число лет и дней.
     int min;
     try (Scanner god = new Scanner(System.in)) {
        System.out.println("Введите время в минутах");
        min = god.nextInt();
        System.out.println(min + " минут это " + (min / 60 / 24 / 365) + " лет и " + (min / 60 / 24 % 365) + " дней");
    }


    }
    }