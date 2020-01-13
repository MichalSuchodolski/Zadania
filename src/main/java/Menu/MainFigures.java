package Menu;

import java.io.IOException;
import java.util.Scanner;

public class MainFigures {

    public static void main() throws IOException {

        Solid s = new Solid();
        FlatFigures f = new FlatFigures();
        int selecting_menu_options;

        System.out.println("     ****************************************");
        System.out.println("     *                 FIGURES              *");
        System.out.println("     ****************************************");
        System.out.println("     1. FlatFigures");
        System.out.println("     2. Solid");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);

        System.out.println("Your choice is");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0){
            switch (selecting_menu_options){
                case 1:
                    f.main();
                    break;
                case 2:
                    s.main();
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
