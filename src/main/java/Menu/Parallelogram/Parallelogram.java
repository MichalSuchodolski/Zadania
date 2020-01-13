package Menu.Parallelogram;

import java.io.IOException;
import java.util.Scanner;

public class Parallelogram {

    public static void main() throws IOException {

        int selecting_menu_options;
        double Area;
        double Perimeter;
        double SideA;
        double SideB;
        double Height;

        System.out.println("     ****************************************");
        System.out.println("     *              PARALLELOGRAM           *");
        System.out.println("     ****************************************");
        System.out.println("     1. Calculate Perimeter");
        System.out.println("     2. Calculate Area");
        System.out.println("     3. Calculate the SideA");
        System.out.println("     4. Calculate the SideB");
        System.out.println("     5. Calculate the Height");
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
                    Perimeter = 2 * SideA + 2 * SideB;
                    System.out.println(" Perimeter = " + Perimeter);
                    break;
                case 2:
                    System.out.println("Enter the SideA length:");
                    SideA = in.nextDouble();
                    System.out.println("Enter the Height length:");
                    Height = in.nextDouble();
                    Area = SideA * Height;
                    System.out.println(" Area = " + Area);
                    break;
                case 3:
                    int optionsA;
                    System.out.println("     ****************************************");
                    System.out.println("     *                 SIDEA                 *");
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
                                System.out.println("Enter the Perimeter:");
                                Perimeter = in.nextDouble();
                                System.out.println("Enter the SideB length:");
                                SideB = in.nextDouble();
                                SideA = (Perimeter - 2 * SideB) / 2;
                                System.out.println(" SideA = " + SideA);
                                break;
                            case 2:
                                System.out.println("Enter the Area:");
                                Area = in.nextDouble();
                                System.out.println("Enter the Height length:");
                                Height = in.nextDouble();
                                SideA = Area / Height;
                                System.out.println(" SideA = " + SideA);
                                break;

                        }
                        System.out.println("\nPress Enter to continue...");
                        System.in.read();
                        main();
                    }

                case 4:
                    System.out.println("Enter the Perimeter:");
                    Perimeter = in.nextDouble();
                    System.out.println("Enter the SideA length:");
                    SideA = in.nextDouble();
                    SideB = (Perimeter - 2 * SideA) / 2;
                    System.out.println(" SideA = " + SideB);
                    break;

                case 5:
                    System.out.println("Enter the Area:");
                    Area = in.nextDouble();
                    System.out.println("Enter the SideA length:");
                    SideA = in.nextDouble();
                    Height = Area / SideA;
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
