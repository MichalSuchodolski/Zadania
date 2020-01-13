package Zadanie5;

public class dzielenie implements Command {

    private final double firstnumber;
    private final double secondnumber;

    public dzielenie(double firstnumber, double secondnumber) {
        this.firstnumber = firstnumber;
        this.secondnumber= secondnumber;
    }

    @Override
    public double execute() {
        double result = firstnumber / secondnumber ;
        System.out.println(firstnumber + "/" + secondnumber + "=" + result);
        return result;
    }
}
