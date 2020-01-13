package Zadaniadomowe;

import java.util.Scanner;
import java.util.SortedMap;

public class Zadanie1 {

    public static void main(String[] args) {

        int a = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Prosze podaj swoje imie: ");
        String forename =  in.nextLine();

        System.out.println("Prosze podaj swoje nazwisko: ");
        String surname = in.nextLine();

        System.out.println("Prosze podaj swoj wiek; ");
         a  = in.nextInt();


        if(a >=18) {
            System.out.println("Cześć " + forename + " " + surname + "! Masz " + a + " lat wiec jestes pełnoletny/pelnoletnia! " );
        }else{
            System.out.println("Cześć " + forename + " " + surname + "! Masz " + a + " lat wiec nie jestes pełnoletny/pelnoletnia! " );
        }






















    }
}
