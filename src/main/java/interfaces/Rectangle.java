package interfaces;

public class Rectangle extends ObjectsAndPackets.Rectangle implements Figure {

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }


    @Override
    public String getType() {
        return "Rectangle";
    }





}
