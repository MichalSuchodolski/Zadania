package Menu.Cuboid;

import java.io.IOException;
import java.util.Scanner;

public class Cuboid {

    public static void main() throws IOException {

        int selecting_menu_options;
        double SurfaceArea;
        double Volume;
        double SideA;
        double SideB;
        double SideC;

        System.out.println("     ****************************************");
        System.out.println("     *                 Cuboid                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Volume");
        System.out.println("     2. Calculate SurfaceArea");
        System.out.println("     3. Calculate the SideA");
        System.out.println("     4. Calculate the SideB");
        System.out.println("     4. Calculate the SideC");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    System.out.println("Enter the SideA length:");
                    SideA = in.nextDouble();
                    System.out.println("Enter the SideB length:");
                    SideB = in.nextDouble();
                    System.out.println("Enter the SideC length:");
                    SideC = in.nextDouble();
                    Volume = SideA * SideB * SideC;
                    System.out.println("Volume = " + Volume);
                    break;
                case 2:
                    System.out.println("Enter the SideA length:");
                    SideA = in.nextDouble();
                    System.out.println("Enter the SideB length:");
                    SideB = in.nextDouble();
                    System.out.println("Enter the SideC length:");
                    SideC = in.nextDouble();
                    SurfaceArea = (2 * SideA * SideB) + (2 * SideA * SideC) + (2 * SideB * SideC);
                    System.out.println("SurfaceArea = " + SurfaceArea);
                    break;
                case 3:
                    int optionsA;
                    System.out.println("     ****************************************");
                    System.out.println("     *                 SideA                 *");
                    System.out.println("     ****************************************");
                    System.out.println("     1. Calculate the SideA with Volume and Sides: ");
                    System.out.println("     2. Calculate the SideA with SurfaceArea and Sides: ");
                    System.out.println("     0. End");

                    System.out.println("Your choice is:");
                    optionsA = in.nextInt();
                    System.out.println();

                    while (optionsA != 0){
                        switch (optionsA){
                            case 1:
                                System.out.println("Enter the Volume: ");
                                Volume = in.nextDouble();
                                System.out.println("Enter the SideB:");
                                SideB = in.nextDouble();
                                System.out.println("Enter the SideC:");
                                SideC = in.nextDouble();
                                SideA = Volume/(SideB * SideC);
                                System.out.println("SideA = " + SideA);
                                break;
                            case 2:
                                break;
                        }
                        System.out.println("\nPress Enter to continue...");
                        System.in.read();
                        main();
                    }
                case 4:
                    int optionsB;
                    System.out.println("     ****************************************");
                    System.out.println("     *                 SideB                 *");
                    System.out.println("     ****************************************");
                    System.out.println("     1. Calculate the SideA with Volume and Sides: ");
                    System.out.println("     2. Calculate the SideA with SurfaceArea and Sides: ");
                    System.out.println("     0. End");

                    System.out.println("Your choice is:");
                    optionsB = in.nextInt();
                    System.out.println();

                    while (optionsB != 0) {
                        switch (optionsB) {
                            case 1:
                                System.out.println("Enter the Volume: ");
                                Volume = in.nextDouble();
                                System.out.println("Enter the SideA:");
                                SideA = in.nextDouble();
                                System.out.println("Enter the SideC:");
                                SideC = in.nextDouble();
                                SideB = Volume / (SideA * SideC);
                                System.out.println("SideB = " + SideB);
                                break;
                            case 2:
                                break;
                        }
                        System.out.println("\nPress Enter to continue...");
                        System.in.read();
                        main();
                    }
                case 5:
                    int optionsC;
                    System.out.println("     ****************************************");
                    System.out.println("     *                 SideA                 *");
                    System.out.println("     ****************************************");
                    System.out.println("     1. Calculate the SideC with Volume and Sides: ");
                    System.out.println("     2. Calculate the SideC with SurfaceArea and Sides: ");
                    System.out.println("     0. End");

                    System.out.println("Your choice is:");
                    optionsC = in.nextInt();
                    System.out.println();

                    while (optionsC != 0) {
                        switch (optionsC) {
                            case 1:
                                System.out.println("Enter the Volume: ");
                                Volume = in.nextDouble();
                                System.out.println("Enter the SideA:");
                                SideA = in.nextDouble();
                                System.out.println("Enter the SideB:");
                                SideB = in.nextDouble();
                                SideC = Volume / (SideB * SideA);
                                System.out.println("SideA = " + SideC);
                                break;
                            case 2:
                                break;
                        }
                        System.out.println("\nPress Enter to continue...");
                        System.in.read();
                        main();
                    }


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
