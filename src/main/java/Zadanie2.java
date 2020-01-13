import java.io.Console;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        int x, wynik;


        System.out.println(" Podaj wartosc x: ");

        Scanner in = new Scanner(System.in);
        x = in.nextInt();


        if (x >= 0) {
            wynik = x;
        }else {
            wynik = -x;
        }


        System.out.println("|" + x + "| = " + wynik);


    }
}
