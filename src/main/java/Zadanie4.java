import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int liczba = s.nextInt();
        List<Integer> dzielniki = new ArrayList<Integer>();
        for(int i=2;i<liczba;i++){
            if((liczba % i)==0) dzielniki.add(i); //Jeśli reszta dzielenia liczby przez i wynosi 0 to jest to dzielnik i dodajemy do list
        }
        System.out.println(dzielniki.toString()); //Wypisanie dzielników


    }
}
