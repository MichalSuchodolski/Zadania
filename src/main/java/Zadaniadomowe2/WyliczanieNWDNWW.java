package Zadaniadomowe2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WyliczanieNWDNWW {


    private static int nwd(int a, int b) {

        while (a !=b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a ;
            }
        }

        return a;
    }



    public static void main(String[] args) throws IOException {

        int a;
        int b;
        int nwd;
        int nww ;


        BufferedReader znak = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj a: ");
        a = Integer.parseInt(znak.readLine());
        System.out.println("Podaj b: ");
        b = Integer.parseInt(znak.readLine());






        nwd = a;
        nww = Math.abs((a*b) / nwd(a,b));


        System.out.println(" NWD = " + nwd);
        System.out.println(" NWW = " + nww);

    }




}
