package HW3;

public class DuplicateElements {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}

//1. Program to print the duplicate elements of an array
//        In this program, we need to print the duplicate elements
//        present in the array. This can be done through two loops.
//        The first loop will select an element and the second loop will
//        iteration through the array by comparing the selected element with
//        other elements. If a match is found, print the duplicate element.
//
//        arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.