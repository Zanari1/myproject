package HW4;

public class CodesOffAsk {


    public static void main(String[] args) {
        char[] charArr = {'c', 'V', 'I', 'n'};
        getCharForInt(charArr);

    }
    public static void getCharForInt(char[] arr) {
        int[] arrInt = new int[arr.length];
        for (int i = 0 ; i < arr.length;  i++){
            arrInt[i] = arr[i];
            System.out.println(arrInt[i]);
        }

        }
}
