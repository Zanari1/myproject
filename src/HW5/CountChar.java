package HW5;

public class CountChar {
    public static void main(String[] args) {

        String exampleString = "Это текст для поиска букв т";

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < exampleString.length(); i++) {

            temp = exampleString.charAt(i);
            if (temp == 'т')
                totalCharacters++;
        }

        System.out.println("Букв т в заданом тексте  " + totalCharacters + " штуки");
    }
}
