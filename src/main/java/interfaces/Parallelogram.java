package interfaces;

public class Parallelogram implements Figure {
    private double sideA, sideB, height;

    public Parallelogram(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }


    @Override
    public double getPerimeter() {
        return 2 *sideA + 2 * sideB;
    }

    @Override
    public double getArea() {
        return sideA * height;
    }



    @Override
    public String getType() {
        return "Parellelogram";
    }




    public double getSide() {
        return getArea() / height;
    }
}
