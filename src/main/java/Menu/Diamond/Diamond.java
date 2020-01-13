package Menu.Diamond;

import java.io.IOException;
import java.util.Scanner;

public class Diamond {
    public static void main() throws IOException {
        int selecting_menu_options;
        double Area;
        double Perimeter;
        double Side;
        double Height;

        System.out.println("     ****************************************");
        System.out.println("     *                 Diamond                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Perimeter");
        System.out.println("     2. Calculate Area");
        System.out.println("     3. Calculate the Side");
        System.out.println("     4. Calculate the Height");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);
        System.out.println("Your choice is");
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
                    System.out.println("Enter the SideA length:");
                    Side = in.nextDouble();
                    System.out.println("Enter the Height length:");
                    Height = in.nextDouble();
                    Area = Side * Height;
                    System.out.println(" Area = " + Area);
                    break;
                case 3:
                    int optionsA;
                    System.out.println("     ****************************************");
                    System.out.println("     *                 SideA                 *");
                    System.out.println("     ****************************************");
                    System.out.println("     1. Calculate the SideA with Perimeter and SideB");
                    System.out.println("     2. Calculate the SideA with Area and Height ");
                    System.out.println("     0. End");


                    System.out.println("Your choice is:");
                    optionsA = in.nextInt();
                    System.out.println();

                    while (optionsA != 0) {
                        switch (optionsA) {
                            case 1:
                                System.out.println(" Enter the Perimeter:");
                                Perimeter = in.nextDouble();
                                Side = Perimeter / 4;
                                System.out.println(" Side = " + Side);
                                break;
                            case 2:
                                System.out.println("Enter the Area:");
                                Area = in.nextDouble();
                                System.out.println("Enter the Height length:");
                                Height = in.nextDouble();
                                Side = Area / Height;
                                System.out.println(" SideA = " + Side);
                                break;

                        }
                        System.out.println("\nPress Enter to continue...");
                        System.in.read();
                        main();
                    }
                case 4:
                    System.out.println("Enter the Area:");
                    Area = in.nextDouble();
                    System.out.println("Enter the SideA length:");
                    Side = in.nextDouble();
                    Height = Area / Side;
                    System.out.println(" Height = " + Height);
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
