package Zadaniadomowe2;

import java.util.Scanner;

public class Testzneta {

    // Obliczamy NWD korzystajac z algorytmu zamieszczonego na stronie www.algorytm.org
    public static int nwd(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }

        return x;
    }

    public static void main(String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);
//Pobieramy pierwsza liczbe
        System.out.print("Podaj pierwsza liczbe: ");
        x = sc.nextInt();
//Pobieramy druga liczbe
        System.out.print("Podaj druga liczbe: ");
        y = sc.nextInt();

//Obliczamy i wyswietlamy NWW



        System.out.println("NWW liczb " + x + " i " + y + " wynosi: " + ((x*y)/nwd(x,y)));
        System.out.println(x);
    }
}
