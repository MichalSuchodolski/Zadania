package Menu;

import Menu.Cone.Cone;
import Menu.Cube.Cube;
import Menu.Cuboid.Cuboid;
import Menu.Prism.Prism;
import Menu.Pyramid.Pyramid;
import Menu.Roller.Roller;
import Menu.Sphere.Sphere;

import java.io.IOException;
import java.util.Scanner;

public class Solid {

    public static void main() throws IOException{

        Cube cube = new Cube();
        Cuboid cuboid = new Cuboid();
        Prism prism = new Prism();
        Pyramid pyramid = new Pyramid();
        Roller roller = new Roller();
        Cone cone = new Cone();
        Sphere sphere = new Sphere();
        int selecting_menu_options;

        System.out.println("     ****************************************");
        System.out.println("     *                 SOLID                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Cube");
        System.out.println("     2. Cuboid");
        System.out.println("     3. Prism");
        System.out.println("     4. Pyramid");
        System.out.println("     5. Roller");
        System.out.println("     6. Cone");
        System.out.println("     7. Sphere");
        System.out.println("     0. End");

        Scanner in = new Scanner(System.in);

        System.out.println("Your choice is:");
        selecting_menu_options = in.nextInt();
        System.out.println();

        while (selecting_menu_options != 0){
            switch (selecting_menu_options){
                case 1:
                    cube.main();
                    break;
                case 2:
                    cuboid.main();
                    break;
                case 3:
                    prism.main();
                    break;
                case 4:
                    pyramid.main();
                    break;
                case 5:
                    roller.main();
                    break;
                case 6:
                    cone.main();
                    break;
                case 7:
                    sphere.main();
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
