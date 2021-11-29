package HW3;

public class MinToMax {
    public static void main(String[] args) {

        int[] mas = {11, 3, 14, 16, 7, 76, 5};
        maxValueCount(mas);
    }
    public static void maxValueCount (int[] mas){
        int count;
        do {
            count = 0;
            int buf;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    count++;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        } while (count > 0);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }

    }
}



//. Write a program that sorts an array from minimum to maximum