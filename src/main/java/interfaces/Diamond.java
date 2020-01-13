package interfaces;

public class Diamond implements Figure{
    private double sideA, height;

    public Diamond(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }


    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

    @Override
    public double getArea() {
        return sideA * height;
    }


    @Override
    public String getType() {
        return "Diamond";
    }




}
