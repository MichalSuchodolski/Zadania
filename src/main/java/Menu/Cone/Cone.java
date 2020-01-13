package Menu.Cone;

import java.io.IOException;
import java.util.Scanner;

public class Cone {

    public static void main() throws IOException {
        int selecting_menu_options;
        double SurfaceArea;
        double Volume;
        double Radius;
        double Height;
        double FormingACone;

        System.out.println("     ****************************************");
        System.out.println("     *                   CONE               *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Volume");
        System.out.println("     2. Calculate SurfaceArea");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    System.out.println("Enter the Radius: ");
                    Radius = in.nextDouble();
                    System.out.println("Enter the Height:");
                    Height = in.nextDouble();
                    Volume = 0.333333333 * Math.PI * Math.pow(Radius, 2) * Height;
                    System.out.println("Volume = " + Volume);
                    break;
                case 2:
                    System.out.println("Enter the Radius: ");
                    Radius = in.nextDouble();
                    System.out.println("Enter the FormingACone:");
                    FormingACone = in.nextDouble();
                    SurfaceArea = (Math.PI * Math.pow(Radius, 2) + (Math.PI * Radius * FormingACone));
                    System.out.println("SurfaceArea = " + SurfaceArea);
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
