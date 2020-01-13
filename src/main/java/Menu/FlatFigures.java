package Menu;

import Menu.Circle.Circle;
import Menu.Diamond.Diamond;
import Menu.Parallelogram.Parallelogram;
import Menu.Rectangle.Rectangle;
import Menu.Square.Square;
import Menu.Trapeze.Trapeze;
import Menu.Triangle.Triangle;

import java.io.IOException;
import java.util.Scanner;

public class FlatFigures {

    public static void main() throws IOException {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Trapeze trapeze = new Trapeze();
        Parallelogram parallelogram = new Parallelogram();
        Diamond diamond = new Diamond();
        int selecting_menu_options;

        System.out.println("     ****************************************");
        System.out.println("     *                FLATFIGURES           *");
        System.out.println("     ****************************************");
        System.out.println("     1. Circle");
        System.out.println("     2. Square");
        System.out.println("     3. Rectangle");
        System.out.println("     4. Triangle");
        System.out.println("     5. Trapeze");
        System.out.println("     6. Parallelogram");
        System.out.println("     7. Diamond");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);

        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    circle.main();
                    break;
                case 2:
                    square.main();
                    break;
                case 3:
                    rectangle.main();
                    break;
                case 4:
                    triangle.main();
                    break;
                case 5:
                    trapeze.main();
                    break;
                case 6:
                    parallelogram.main();
                    break;
                case 7:
                    diamond.main();
                    break;


            }
            System.out.println("\nPress Enter to continue");
            System.in.read();
            main();

        }
        System.out.println("     ****************************************");
        System.out.println("\n     End of program\n\n");
        System.exit(0);


    }
}
