import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        int a = 0;

        System.out.println(" Podaj wiek: ");

        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        if(a >=18) {
            System.out.println("Jestes pelnoletni");
        }else{
            System.out.println("Nie jestes pelnoletni");
        }
    }




}
