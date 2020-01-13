package interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[7];


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the radius: ");
        figures[0] = new Circle(scanner.nextDouble());


        System.out.println(" Enter the two sides of the triangle: ");
        figures[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());


        System.out.println(" Enter the two sides of the rectangle ");
        figures[2] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println(" Enter the side of the square: ");
        figures[3] = new Square(scanner.nextDouble());

        System.out.println(" Enter the sides and height of the parallelogram ");
        figures[4] = new Parallelogram(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println(" Enter trapezoid dimensions: ");
        figures[5] = new Trapeze(scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble(),
                scanner.nextDouble());

        System.out.println(" Enter the side and height of the diamond: ");
        figures[6] = new Diamond(scanner.nextDouble(), scanner.nextDouble());


        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println(" Area " + figure.getArea());
            System.out.println(" Perimeter " + figure.getPerimeter());

        }


    }
}
