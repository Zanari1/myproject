package HW3;



public class MinValue {
    public static void main(String[] args) {
        int[] arr = {2, 121, 9, 43};
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];

            }
        }
        System.out.println(minValue);
    }
}


//3. Write a program that finds the minimum value in an array