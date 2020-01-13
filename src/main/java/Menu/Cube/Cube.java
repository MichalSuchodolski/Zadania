package Menu.Cube;

import java.io.IOException;
import java.util.Scanner;

public class Cube {

    public static void main() throws IOException {

        int selecting_menu_options;
        double SurfaceArea;
        double Volume;
        double Side;

        System.out.println("     ****************************************");
        System.out.println("     *                 CUBE                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Volume");
        System.out.println("     2. Calculate SurfaceArea");
        System.out.println("     3. Calculate the Side with Volume");
        System.out.println("     4. Calculate the Side with SurfaceArea");
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
                    Volume = Math.pow(Side, 3);
                    System.out.println(" Volume = " + Volume);
                    break;
                case 2:
                    System.out.println("Enter the Side length:");
                    Side = in.nextDouble();
                    SurfaceArea = 6 * Math.pow(Side, 2);
                    System.out.println(" SurfaceArea = " + SurfaceArea);
                    break;
                case 3:
                    System.out.println("Enter the Volume:");
                    Volume = in.nextDouble();
                    Side = Math.pow(Volume, 1 / 3);
                    System.out.println(" Side = " + Side);
                    break;

                case 4:
                    System.out.println("Enter the SurfaceArea: ");
                    SurfaceArea = in.nextDouble();
                    Side = Math.sqrt(SurfaceArea);
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
