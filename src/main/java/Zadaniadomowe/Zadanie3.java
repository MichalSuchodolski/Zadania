package Zadaniadomowe;


public class Zadanie3 {


    public static int wystapienie_litera(String napis, char litera)
    {
        int ile_liter = 0;  // zmienna, w której będziemy przechowywać
        // liczbę zliczonych znaków
        char znak_z_napisu; // zmienna do pobierania kolejnych liter z napisu
        for (int i = 0 ; i < napis.length() ; i++) // przejście po napisie
        {
            znak_z_napisu = napis.charAt(i); // pobieramy pojedynczy znak z napisu
            if(znak_z_napisu == litera) // porównanie ze znakiem
            {                           // przekazywanym jako parametr
                ile_liter++; // zwiększamy wartość zmiennej
            }
        }
        return ile_liter;
    }

    /* funkcja zbliżona do powyższej, ale tym razem nie jest istotna
     * wielkość litery podanej jako parametr. Przykładowo 'A' oraz 'a'
     * zliczane będą jako ten sam znak
     */
    public static int wystapienie_litera_male_i_wielkie(String napis, char litera)
    {
        int ile_liter = 0;  // zmienna, w której będziemy przechowywać
        // liczbę zliczonych znaków
        char znak_z_napisu; // zmienna do pobierania kolejnych liter z napisu

        // pojedynczy znak traktujemy jako napis, następnie stosując funkcję
        // toUpperCase() zmieniamy go na napis składający się z jednej, wielkiej
        // litery. Pobieramy tę literę przy pomocy charAt i wpisujemy to
        // zmiennej litera
        litera = String.valueOf(litera).toUpperCase().charAt(0);
        for (int i = 0 ; i < napis.length() ; i++) // przejście po napisie
        {
            znak_z_napisu = napis.charAt(i); // pobieramy pojedynczy znak z napisu
            znak_z_napisu = String.valueOf(znak_z_napisu).toUpperCase().charAt(0);
            if(znak_z_napisu == litera) // porównanie ze znakiem
            {                           // przekazywanym jako parametr
                ile_liter++; // zwiększamy wartość zmiennej
            }
        }
        return ile_liter;
    }

    public static void main(String[] args)
    {
        String przykladowy_napis = "Alibaba i czterdziestu rozbojnikow";
        System.out.println(wystapienie_litera(przykladowy_napis, 'A'));
        System.out.println(wystapienie_litera_male_i_wielkie(przykladowy_napis, 'A'));
    }


}
