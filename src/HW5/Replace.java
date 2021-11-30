package HW5;

public class Replace {
    public static void main(String[] args) {
        String input = "AX6BYU56UX6CV6BNT7NM";
        replace(input);
    }
    public static void replace(String args){
        String input = "AX6BYU56UX6CV6BNT7NM";

        String alpha ="";
        String num1 = "";
        int num2 = 1;

        char[] c_arr = input.toCharArray();

        for(char c: c_arr) {
            if(Character.isDigit(c)) {
                num1 = num1 + c;
                if (num1.length() == 2) {
                    num2 = Integer.parseInt(num1) * num2;
                    num1 = "";
                }
            }
            else {
                alpha = alpha + c;
            }
        }

        System.out.println(alpha + " " + num2);

    }

}
