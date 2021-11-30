package HW6;

public class Watch {
    public int cost;
    public String brand;
    public String color;


    @Override
    public  String toString() {
        return (" часы бренда "+ brand + " цвета "+ color + " стоят " + cost+"$");

    }

}
