package interfaces;

public class Triangle implements Figure {
    private double a, b, hypotenuse;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.hypotenuse = Math.sqrt( a * a + b * b);

    }


    @Override
    public double getPerimeter() {
        return hypotenuse + a + b ;
    }

    @Override
    public double getArea() {
        return a * b / 2 ;
    }

    @Override
    public String getType() {
        return "Triangle";
    }





}
