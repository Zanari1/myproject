package HW4;

public class SumOfArr {

    public static void main(String[] args) {
        int[]arr = {12, 14, 18, 29};
        summOffArr(arr);
    }
    public static void summOffArr (int[] arr){
        int summ = 0;
        for (int num: arr) {
            summ =summ + num;
        }
        System.out.println( "Сумма чисел в вашем масиве = " + summ);
    }
}
