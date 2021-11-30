package HW6;

public class someBuilding {
    public static void main(String[] args) {
        building friend1 = new building();
        friend1.name = "Oleg";
        friend1.floors = 12;
        friend1.room = 196;
        System.out.println(friend1.toString());

        building friend2 = new building();
        friend2.name = "Ivan";
        friend2.floors = 1;
        friend2.room = 16;
        System.out.println(friend2.toString());

        building friend3 =  friend2;
        friend3.name = "Maria";
        System.out.println(friend3.toString());
    }
}
