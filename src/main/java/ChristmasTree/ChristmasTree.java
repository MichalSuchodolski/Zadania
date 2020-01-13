package ChristmasTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChristmasTree {

        public static void main(String[] args) {
            int szerokosc;
            int wysokosc;
            char znakGwiazdki = '*';
            Scanner sc = new Scanner(System.in);
            System.out.print("Podaj ilosc poziomow choinki: ");
            int poziomy = sc.nextInt();
            System.out.println("Prosze podaj szerokość prostokąta :");
            szerokosc = sc.nextInt();
            System.out.println("Prosze podaj wysokosc prostokata: ");
            wysokosc = sc.nextInt();

            for (int i = 0; i < poziomy; i++) {
                for (int j = 0; j < poziomy * 2; j++) {
                    if (j < (poziomy - i) || j > (poziomy + i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(znakGwiazdki);
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < wysokosc; i++) {
                for (int j = 0; j < szerokosc; j++) {
                    int odstemp = 0;
                    while (odstemp < (wysokosc - 1 ) || odstemp > (szerokosc - 1)) {
                        odstemp ++;
                        System.out.print(" ");

                    }
                    System.out.print(znakGwiazdki);
                }


                System.out.println();

            }
        }




}
