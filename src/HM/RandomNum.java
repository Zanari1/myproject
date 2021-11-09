package HM;

import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {


        Scanner bottom = new Scanner(System.in);
        System.out.println("Введите нижний диапазон");
        int min = bottom.nextInt();
        Scanner top = new Scanner(System.in);
        System.out.println("Введите верхний диапазон");
        int max = top.nextInt();
        int a = (int) ((Math.random() * (max - min)) + min);
        System.out.println("1-е случайное число " + a);
        int b = (int) ((Math.random() * (max - min)) + min);
        System.out.println("2-е случайное число " + b);
        int c = (int) ((Math.random() * (max - min)) + min);
        System.out.println("3-е случайное число " + c);
        int d = (int) ((Math.random() * (max - min)) + min);
        System.out.println("4-е случайное число " + d);
        int e = (int) ((Math.random() * (max - min)) + min);
        System.out.println("5-е случайное число " + e);
    }
}