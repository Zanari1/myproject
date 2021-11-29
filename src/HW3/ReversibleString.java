package HW3;

public class ReversibleString {
    public static void main(String[] args) {


        char[] arr = new char[]{'J', 'A', 'V', 'A'};
        int len = arrleng(arr);
        takeCharFromArr(len, arr);
    }

    public static Integer arrleng(char[] array) {
        int dlina = array.length;
        return dlina;
    }
    public static void takeCharFromArr(int len, char[] arr) {
        while (len > 0) {
            System.out.println(arr[len - 1]);
            len--;
        }
        System.out.println("");
    }


}

//5. Write a program that outputs a reversible string (use an array of characters - char string [])