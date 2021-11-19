package HW3;

public class ReverseOrder {
    public static void main(String[] args) {


        String[] arr = new String[]{"one", "two", "three", "four"};
        int len = arr.length;
        int[] arrint = new int[]{1, 2, 3, 4, 5};
        int lenint = arrint.length;

        System.out.println("В обратном порядке стрингу");
        while (len > 0){
            System.out.println(arr[len - 1]);
            len--;
        }
        System.out.println("");

        System.out.println("В обратном порядке интовые значения");
        while (lenint > 0){
            System.out.println(arrint[lenint - 1]);
            lenint--;
        }
        System.out.println("");

    }
}


//    Program to print the elements of an array in reverse order
//        In this program, we need to print the elements of the array in reverse order that is; the last element should be displayed first, followed by second last element and so on.
//
//        Program to print the elements of an array in reverse order
//        int[] = {1, 2, 3, 4, 5}
//        OR
//        String[] = {"one", "two", "three", "four"}