package HW5;

public class Removal {
    public static void main(String[] args) {
        String str = "abcdasjncddDCBA123";
         Dellitfirst(str);
         DellitCd(str);
         DellitNumb(str);
         DellitUper(str);

    }
    public static void Dellitfirst(String str){
        String srt = "ajsdh";
        System.out.println("Удаляем первую 'a' = "+str.replaceFirst("a", ""));

    }
    public static void DellitCd(String str){
        System.out.println("Удаляем все 'cd' = "+str.replaceAll("cd", ""));
    }
    public static void DellitNumb(String str){
        System.out.println("Удаляем все цыфры = "+str.replaceAll("([0-9])", ""));
    }
    public static void DellitUper(String str){
        System.out.println("Удаляем все символы верхнего реситра  = "+str.replaceAll("([A-Z])", ""));
    }

}

