package HW5;
import java.util.Random;
public class RandomString {
    public static void main(String[] args) {
        int len = 50;
        System.out.println(alphaNumeric(len));
        System.out.println(numeric(len));
        System.out.println(alpha(len));
    }

    public static String numeric(int len) {
        String numeric = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(numeric.charAt(rnd.nextInt(numeric.length())));
        return sb.toString();
    }

    public static String alpha(int len) {
        String numeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(numeric.charAt(rnd.nextInt(numeric.length())));
        return sb.toString();
    }

    public static String alphaNumeric(int len) {
        String numeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(numeric.charAt(rnd.nextInt(numeric.length())));
        return sb.toString();
    }
}

