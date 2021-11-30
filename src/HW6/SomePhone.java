package HW6;

public class SomePhone {
    public static void main(String[] args) {
        Phone iphone = new Phone("2000$", "blue", 12);
        System.out.println(iphone.toString());

        Phone iphone2 = new Phone("2050$", "silver", 11);
        System.out.println(iphone2.toString());

        Phone android = new Phone( "Android", "2004$", "black", 18);
        System.out.println(android.toString());
    }



}
