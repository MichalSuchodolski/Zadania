package interfaces;

public class Circle implements Figure {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        return;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }


    public double getRadius(){
        return getPerimeter() / 2 * Math.PI;
    }







}
