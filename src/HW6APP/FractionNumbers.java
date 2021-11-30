package HW6APP;


public class FractionNumbers {

    private double numberA;
    private double numberB;

    public FractionNumbers(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void plusCount() {
        System.out.println(numberA + numberB);
    }

    public void minusCount() {
        System.out.println(numberA - numberB);
    }

    public void multiplyCount() {
        System.out.println(numberA * numberB);
    }

    public void divideCount() {
        if (numberA == 0 | numberB == 0) {
            System.out.println("На 0 не делят");
        } else {
            System.out.println(numberA / numberB);
        }
    }
    @Override
    public String toString() {
        return ( "Ваше первое число " + numberA + " ваше второе число " + numberB);
    }

}
