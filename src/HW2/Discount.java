package HW2;
import java.util.Scanner;
public class Discount {

    public static void main(String[] args) {
        System.out.print("Введите сумму покупки : ");
        double a = takeDoubleFromScanner() ;
        printResult(a);
    }

    public static Double CymmaPokypki(Double i) {
        return (i - (i * 15) /100);
    }
    public static Double takeDoubleFromScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static void printResult(double a) {
        if ( a > 1000) {
            System.out.println( "Сумма вашей покупки со скидкой = "+  CymmaPokypki(a) + "$");
        }
        else{
            System.out.println("Сумма вашей покупки = "+ a + "$ скидка предоставляется на сумму покупки более 1000$");
        }
    }

}




//(*). Сумма покупки составляет а$. Если а больше 1000$,
// то предоставляется скидка 15%. Вывести на экран сумму
// покупки с учетом скидки либо сообщение о том, что скидка
// не предоставляется.
