import java.util.Scanner;

public class Zadania9 {


    public static void main(String[] args) {

        int szerokosc;

        int wysokosc;

        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podaj szerokość prostokąta :");
        szerokosc = in.nextInt();
        System.out.println("Prosze podaj wysokosc prostokata: ");
        wysokosc = in.nextInt();
        int indentation = 0;


        for (int i = 0; i < szerokosc; i++)  {
            for (int j = 0; j < wysokosc; j++) {


                        System.out.print('*');

            }

            System.out.println();

        }
    }


}


