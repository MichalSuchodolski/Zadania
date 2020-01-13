package interfaces;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 *a;
    }

    @Override
    public double getArea() {
        return Math.pow(a,2);
    }

    @Override
    public String getType() {
        return "Square";
    }





}
