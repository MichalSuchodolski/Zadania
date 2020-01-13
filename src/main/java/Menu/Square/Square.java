package Menu.Square;

import java.io.IOException;
import java.util.Scanner;

public class Square {

    public static void main() throws IOException {
        int selecting_menu_options;
        double Area;
        double Perimeter;
        double Side;

        System.out.println("     ****************************************");
        System.out.println("     *                 SQUARE               *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Perimeter");
        System.out.println("     2. Calculate Area");
        System.out.println("     3. Calculate the Side with Perimeter");
        System.out.println("     4. Calculate the Side with Area");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();


        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    System.out.println("Enter the Side length:");
                    Side = in.nextDouble();
                    Perimeter = 4 * Side;
                    System.out.println(" Perimeter = " + Perimeter);
                    break;
                case 2:
                    System.out.println("Enter the Side length:");
                    Side = in.nextDouble();
                    Area = Math.pow(Side, 2);
                    System.out.println(" Area = " + Area);
                    break;
                case 3:
                    System.out.println(" Enter the Perimeter:");
                    Perimeter = in.nextDouble();
                    Side = Perimeter / 4;
                    System.out.println(" Side = " + Side);
                    break;
                case 4:
                    System.out.println(" Enter the Area:");
                    Area = in.nextDouble();
                    Side = Math.sqrt(Area);
                    System.out.println(" Side = " + Side);
                    break;
            }
            System.out.println("\nPress Enter to continue...");
            System.in.read();
            main();

        }


        System.out.println("     ****************************************");
        System.out.println("\n     End of program\n\n");
        System.exit(0);


    }

}
