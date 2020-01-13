package Menu.Roller;

import java.io.IOException;
import java.util.Scanner;

public class Roller {
    public static void main() throws IOException {
        int selecting_menu_options;
        double SurfaceArea;
        double Volume;
        double Radius;
        double Height;


        System.out.println("     ****************************************");
        System.out.println("     *                 Roller               *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Volume");
        System.out.println("     2. Calculate SurfaceArea");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0){
            switch (selecting_menu_options){
                case 1:
                    System.out.println("Enter the Radius: ");
                    Radius = in.nextDouble();
                    System.out.println("Enter the Height:");
                    Height = in.nextDouble();
                    Volume = Math.PI * Math.pow(Radius,2) * Height;
                    System.out.println("Volume = " + Volume);
                    break;
                case 2:
                    System.out.println("Enter the Radius: ");
                    Radius = in.nextDouble();
                    System.out.println("Enter the Height:");
                    Height = in.nextDouble();
                    SurfaceArea = (2 * Math.PI * Math.pow(Radius,2) + (2 * Math.PI * Radius * Height ));
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
