package HW2;
import java.util.Scanner;
public class CheckPassFail {
    public static void main(String[] args) {



        Scanner Numb = new Scanner(System.in);
        System.out.println("Число");
        int mark = Numb.nextInt();
                if( mark >= 50 ){
                    System.out.println("Pass");
                }else{
                    System.out.println("Fail");
                }
        System.out.println("Done");
            }
        }




//        1.Написать программу с названием “CheckPassFail”, которая выводит
//        PASS если переменная “mark” типа int больше или равно 50 или вывести “FAIL” в противном случае.
//                Программа всегда должна перед выходом печатать “DONE”


