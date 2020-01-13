package Menu;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) throws IOException {

        MainFigures mf = new MainFigures();
        int selecting_menu_options;


        System.out.println("     ****************************************");
        System.out.println("     *             MAINMENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Figures");
        System.out.println("     0. End");


        Scanner in = new Scanner(System.in);

        System.out.println(" Your choice is: ");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0) {
            switch (selecting_menu_options) {
                case 1:
                    mf.main();

                    break;
            }
            System.out.println("\nPress Enter to continue");
            System.in.read();



        }

        System.out.println("     ****************************************");
        System.out.println("\n     End of program\n\n");
        System.exit(0);


    }


}
