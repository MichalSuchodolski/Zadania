package Menu.Circle;

import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Circle {

    public static void main() throws IOException {


        int selecting_menu_options;

        double Area;
        double Perimeter;
        double Radius;

        System.out.println("     ****************************************");
        System.out.println("     *                 CIRCLE               *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Perimeter");
        System.out.println("     2. Calculate Area");
        System.out.println("     3. Calculate the Radius with Perimeter");
        System.out.println("     4. Calculate the Radius with Area");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    System.out.println("Enter the radius length:");
                    Radius = in.nextDouble();
                    Perimeter = 2 * Math.PI * Radius;
                    System.out.println(" Perimeter = " + Perimeter);
                    break;
                case 2:
                    System.out.println("Enter the radius lenght:");
                    Radius = in.nextDouble();
                    Area = Math.PI * Math.pow(Radius, 2);
                    System.out.println(" Area = " + Area);
                    break;
                case 3:
                    System.out.println("Enter the perimeter:");
                    Perimeter = in.nextDouble();
                    Radius = Perimeter / 2 * Math.PI;
                    System.out.println(" Radius = " + Radius);
                    break;
                case 4:
                    System.out.println("Enter the Area:");
                    Area = in.nextDouble();
                    Radius = Math.sqrt(Area / Math.PI);
                    System.out.println(" Radius = " + Radius);
                    break;

            }
            System.out.println("\nPress Enter to continue...");
            selecting_menu_options = in.nextInt();




        }
        System.out.println("     ****************************************");
        System.out.println("\n     End of program\n\n");



    }


}
