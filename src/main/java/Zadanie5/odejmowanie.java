package Zadanie5;

public class odejmowanie implements Command {

    private final double firstnumber;
    private final double secondnumber;

    public odejmowanie(double a, double b) {
        this.firstnumber = a;
        this.secondnumber = b;
    }

    @Override
    public double execute() {
        double result = firstnumber - secondnumber ;
        System.out.println(firstnumber + "-" + secondnumber + "=" + result);
        return result;
    }
}
