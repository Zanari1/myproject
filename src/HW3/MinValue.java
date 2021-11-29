package HW3;



public class MinValue {
    public static void main(String[] args) {
        int[] arr = {2, 121, 9, 43};
        int minValue = arr[0];
        findMinValue(minValue, arr);
    }
    public static void findMinValue(int minVaalue, int[] arrInt){
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < minVaalue) {
                minVaalue = arrInt[i];

            }
        }
        System.out.println(minVaalue);



    }
}


//3. Write a program that finds the minimum value in an array