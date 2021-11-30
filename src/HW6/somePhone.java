package HW6;

public class somePhone {
    public static void main(String[] args) {
        phone iphone = new phone("2000$", "blue", 12);
        System.out.println(iphone.toString());

        phone iphone2 = new phone("2050$", "silver", 11);
        System.out.println(iphone2.toString());

        phone android = new phone( "Android", "2004$", "black", 18);
        System.out.println(android.toString());
    }



}
