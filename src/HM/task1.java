package HM;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


        //Рандомайзер с выбором верхнего диапазона
        //            int a;
        int b;
        try (Scanner random = new Scanner(System.in)) {
//            System.out.println("Введите начало диапазона");
//            a = random.nextInt();
            System.out.println("Введите конец диапазона");
            b = random.nextInt();
            int rnumb1 = (int) ((Math.random() * b) + 1);
            System.out.println("1-ое случайное число: " + rnumb1);
            int rnumb2 = (int) ((Math.random() * b) + 1);
            System.out.println("2-ое случайное число: " + rnumb2);
            int rnumb3 = (int) ((Math.random() * b) + 1);
            System.out.println("3-е случайное число: " + rnumb3);
            int rnumb4 = (int) ((Math.random() * b) + 1);
            System.out.println("4-е случайное число: " + rnumb4);
            int rnumb5 = (int) ((Math.random() * b) + 1);
            System.out.println("5-е случайное число: " + rnumb5);
        }
    }
}