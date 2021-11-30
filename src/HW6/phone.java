package HW6;

public class phone {
    private String os = "ios";
    private String cost;
    private int model;
    private String color;

    public phone(String cost, String color, int model) {
        this.cost = cost;
        this.color = color;
        this.model = model;
    }

    public phone(String os, String cost, String color, int model) {
        this.cost = cost;
        this.color = color;
        this.model = model;
        this.os = os;

    }


    @Override
    public String toString() {
        return ("модель телефона " + model + " цвет  " + color + " оперативная система  " + os + " цена  " + cost);

    }
}
