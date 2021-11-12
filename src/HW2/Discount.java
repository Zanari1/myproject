package HW2;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму покупки : ");
        double a = input.nextDouble();

        if ( a > 1000) {
            System.out.println( "Сумма вашей покупки со скидкой = "+  (a - (a * 15) /100) + "$");
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
